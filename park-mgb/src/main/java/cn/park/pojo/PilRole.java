package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilRole implements Serializable {
    private Integer id;

    /**
     * 角色名
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 是否启用(否0,是1)
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 备注信息
     *
     * @mbggenerated
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", desc=").append(desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}