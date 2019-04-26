package cn.park.config;

import cn.park.mapper.AdminMapper;
import cn.park.pojo.Admin;
import cn.park.pojo.RespBean;
import cn.park.service.AdminService;
import cn.park.service.TokenService;
import cn.park.utils.AdminUtils;
import cn.park.utils.Dto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    TokenService tokenService;
    @Autowired
    AdminService adminService;
    @Autowired
    CustomMetadataSource metadataSource;
    @Autowired
    UrlAccessDecisionManager urlAccessDecisionManager;
    @Autowired
    AuthenticationAccessDeniedHandler deniedHandler;

//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new MD5PasswordEncoder();
//    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(adminService).passwordEncoder(new BCryptPasswordEncoder());
// .passwordEncoder(new PasswordEncoder() {
//            @Override
//            public String encode(CharSequence rawPassword) {
//                return MD5Util.encode((String)rawPassword);
//            }
//            @Override
//            public boolean matches(CharSequence rawPassword, String encodedPassword) {
//                return encodedPassword.equals(MD5Util.encode((String)rawPassword));
//            }
//        }
//        ); //user Details Service验
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/index.html","/static/**","/login_p","/favicon.ico","/webjars/**","/swagger-ui.html/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                        o.setSecurityMetadataSource(metadataSource);
                        o.setAccessDecisionManager(urlAccessDecisionManager);
                        return o;
                    }
                })
                .and()
                .formLogin().loginPage("/login_p").loginProcessingUrl("/login")
                .usernameParameter("username").passwordParameter("password")
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse resp, AuthenticationException e) throws IOException, ServletException {
                        resp.setContentType("appliaction/json;charset=utf-8");
                        RespBean respBean=null;
                        if (e instanceof BadCredentialsException ||e instanceof UsernameNotFoundException){
                            respBean=RespBean.error("账户名或密码输入错误");
                        }else if (e instanceof LockedException){
                            respBean=RespBean.error("账户被锁定，请联系管理员");
                        }else if (e instanceof CredentialsExpiredException){
                            respBean=RespBean.error("密码过期，请联系管理员");
                        }else if(e instanceof AccountExpiredException){
                            respBean=RespBean.error("账户过期，请联系管理员");
                        }else if (e instanceof DisabledException){
                            respBean=RespBean.error("账户被禁用，请联系管理员");
                        }else {
                            respBean=RespBean.error("登录失败");
                        }
                        resp.setStatus(401);
                        ObjectMapper om = new ObjectMapper();
                        PrintWriter out=resp.getWriter();
                        out.write(om.writeValueAsString(respBean));
                        out.flush();
                        out.close();
                    }
                })
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication auth) throws IOException, ServletException {
                        resp.setContentType("appliaction/json;charset=utf-8");
                        RespBean respBean=RespBean.ok("登录成功！", AdminUtils.getCurrentHr());
                        String userAgent=req.getHeader("user-agent");
                        System.err.println(userAgent);
                        Dto dto = new Dto();
                        String name=auth.getName();
                        Admin hr = adminMapper.getAdminByUsername(name);
                        System.err.println(name);
                        System.err.println( hr.getUsername()+""+ hr.getPhone() );
                        String token=tokenService.generateToken(userAgent,hr);
                        tokenService.save(token,hr);
                        dto.setIsLogin("true");
                        dto.setToken(token);
                        dto.setTokenCreatedDate(System.currentTimeMillis());
                        dto.setTokenExpiryDate(System.currentTimeMillis() + 2*60*60*1000);
                        ObjectMapper om=new ObjectMapper();
                        PrintWriter out=resp.getWriter();
                        out.write(om.writeValueAsString(respBean));
                        out.flush();
                        out.close();
                    }
                })
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    @RequestMapping(method = RequestMethod.GET,produces = "application/json",headers = "token")
                    public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        String token=req.getHeader("token");
                        tokenService.delete(token);
                        RespBean respBean = RespBean.ok("注销成功!");
                        ObjectMapper om = new ObjectMapper();
                        PrintWriter out = resp.getWriter();
                        out.write(om.writeValueAsString(respBean));
                        out.flush();
                        out.close();
                    }
                })
                .permitAll()
                .and().csrf().disable()
                .exceptionHandling().accessDeniedHandler(deniedHandler);
    }
}
