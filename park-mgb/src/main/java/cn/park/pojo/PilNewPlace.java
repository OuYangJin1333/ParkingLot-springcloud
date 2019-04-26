package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilNewPlace implements Serializable {
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
     * 停车结束时间
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * 此停车场剩余车位数
     *
     * @mbggenerated
     */
    private Integer count;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        sb.append(", count=").append(count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}