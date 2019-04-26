package cn.park.pojo;

import java.io.Serializable;

public class PilDepartment implements Serializable {
    private Integer id;

    /**
     * 部门名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 父级部门名称(没有为null)
     *
     * @mbggenerated
     */
    private Integer parentid;

    /**
     * 备注
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", desc=").append(desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}