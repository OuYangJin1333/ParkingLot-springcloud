package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilStopInfo implements Serializable {
    private Integer id;

    /**
     * 停车场id
     *
     * @mbggenerated
     */
    private Integer pid;

    /**
     * 开始停车时间
     *
     * @mbggenerated
     */
    private Date beginTime;

    /**
     * 结束停车时间
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * 是否是会员用户（否0,是1）
     *
     * @mbggenerated
     */
    private Integer isvip;

    /**
     * 如果是会员用户,会员card
     *
     * @mbggenerated
     */
    private String vid;

    /**
     * 车子类型(大车,小车)
     *
     * @mbggenerated
     */
    private String cartype;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isvip=").append(isvip);
        sb.append(", vid=").append(vid);
        sb.append(", cartype=").append(cartype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}