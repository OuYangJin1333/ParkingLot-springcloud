package cn.park.pojo;

import java.io.Serializable;

public class PilSystemType implements Serializable {
    private Integer id;

    /**
     * 分类名(内部,全部,外部)
     *
     * @mbggenerated
     */
    private String type;

    /**
     * 管理人员是否可以产看(否0,是1)
     *
     * @mbggenerated
     */
    private Integer isadmin;

    /**
     * 会员人员是否可以产看(否0,是1)
     *
     * @mbggenerated
     */
    private Integer isvip;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", isadmin=").append(isadmin);
        sb.append(", isvip=").append(isvip);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}