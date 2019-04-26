package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilVipComplain implements Serializable {
    private Integer id;

    /**
     * 会员card
     *
     * @mbggenerated
     */
    private String vid;

    /**
     * 投诉时间
     *
     * @mbggenerated
     */
    private Date complainTime;

    /**
     * 状态(已处理,待处理)
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 处理人,如果状态为未处理,则为null
     *
     * @mbggenerated
     */
    private Integer aid;

    /**
     * 处理建议,如果状态为未处理,则为null
     *
     * @mbggenerated
     */
    private String advice;

    /**
     * 投诉内容
     *
     * @mbggenerated
     */
    private String content;

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

    public Date getComplainTime() {
        return complainTime;
    }

    public void setComplainTime(Date complainTime) {
        this.complainTime = complainTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vid=").append(vid);
        sb.append(", complainTime=").append(complainTime);
        sb.append(", status=").append(status);
        sb.append(", aid=").append(aid);
        sb.append(", advice=").append(advice);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}