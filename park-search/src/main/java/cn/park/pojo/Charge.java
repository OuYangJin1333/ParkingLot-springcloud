package cn.park.pojo;

import java.util.Date;
import java.util.List;

/**
 * 收费表记录
 */
public class Charge {
    private String partName;
    private String carNumber;
    private String vid;
    private Date beginTime;
    private Date endTime;
    private String payType;
    private Double money;
    private Double givePrice;
    private Double lostPrice;
    private String name;
    private String aname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getGivePrice() {
        return givePrice;
    }

    public void setGivePrice(Double givePrice) {
        this.givePrice = givePrice;
    }

    public Double getLostPrice() {
        return lostPrice;
    }

    public void setLostPrice(Double lostPrice) {
        this.lostPrice = lostPrice;
    }
}
