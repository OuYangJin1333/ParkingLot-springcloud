package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilVipUser implements Serializable {
    private Integer id;

    /**
     * 会员card
     *
     * @mbggenerated
     */
    private String vid;

    /**
     * 会员名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 性别
     *
     * @mbggenerated
     */
    private String sex;

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
     * 邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 车牌号
     *
     * @mbggenerated
     */
    private String carNumber;

    /**
     * 注册时间
     *
     * @mbggenerated
     */
    private Date registerTime;

    /**
     * 账户余额
     *
     * @mbggenerated
     */
    private Double balance;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vid=").append(vid);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", identification=").append(identification);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", balance=").append(balance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}