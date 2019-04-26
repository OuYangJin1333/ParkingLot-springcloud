package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilAdmin implements Serializable {
    private Integer id;

    /**
     * 登录名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 图片地址
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 最近登录时间
     *
     * @mbggenerated
     */
    private Date loginTime;

    /**
     * 入职时间
     *
     * @mbggenerated
     */
    private Date entryTime;

    /**
     * 是否启用(否0，是1)
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 证件号码
     *
     * @mbggenerated
     */
    private String identification;

    /**
     * 电话
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 性别(男,女)
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * 工作地点
     *
     * @mbggenerated
     */
    private String address;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", status=").append(status);
        sb.append(", identification=").append(identification);
        sb.append(", phone=").append(phone);
        sb.append(", sex=").append(sex);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}