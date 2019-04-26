package cn.park.pojo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Admin {

   private   int   id;
    private   String  username; //用户名
    private  String  password;
    private  String  email;
    private  Date logintime;
    private  Date  entrytime; //入职时间
    private  int status;
    private  String  identification;
    private  String phone;
    private  String  sex;
    private  String address;
    @ApiModelProperty(   hidden = true)
    private  int departmentId;//部门外键
    @ApiModelProperty(   hidden = true)
    private  int  roleId;   //角色外键
    @ApiModelProperty(   hidden = true)
    private  String  dname;   //部门名称
    @ApiModelProperty(   hidden = true)
    private  String  rname;   //部门名称

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", identification='" + identification + '\'' +
                ", dname='" + dname + '\'' +
                ", rname='" + rname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", logintime=" + logintime +
                ", entrytime=" + entrytime +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}
