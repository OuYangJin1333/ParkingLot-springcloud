package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilAccounts implements Serializable {
    private Integer id;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 停车收费表id
     *
     * @mbggenerated
     */
    private Integer sicid;

    /**
     * 根据跟停车场签订的合约,分给停车场的金额
     *
     * @mbggenerated
     */
    private Double topil;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSicid() {
        return sicid;
    }

    public void setSicid(Integer sicid) {
        this.sicid = sicid;
    }

    public Double getTopil() {
        return topil;
    }

    public void setTopil(Double topil) {
        this.topil = topil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", sicid=").append(sicid);
        sb.append(", topil=").append(topil);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}