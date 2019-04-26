package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilSystem implements Serializable {
    private Integer id;

    /**
     * 公告标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 公告类型
     *
     * @mbggenerated
     */
    private Integer tid;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date create_time;

    /**
     * 公告内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 发布状态
     */
    private String status;
    /**
     * 发布人
     */
    private Integer aid;
    /**
     * 发布人姓名
     */
    private String aUserName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Date createTime) {
        this.create_time = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getaUserName() {
        return aUserName;
    }

    public void setaUserName(String aUserName) {
        this.aUserName = aUserName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", tid=").append(tid);
        sb.append(", create_time=").append(create_time);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}