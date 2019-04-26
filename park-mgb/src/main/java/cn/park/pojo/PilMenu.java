package cn.park.pojo;

import java.io.Serializable;

public class PilMenu implements Serializable {
    private Integer id;

    /**
     * 访问路径
     *
     * @mbggenerated
     */
    private String url;

    /**
     * 路径
     *
     * @mbggenerated
     */
    private String path;

    /**
     * 组件包名
     *
     * @mbggenerated
     */
    private String component;

    private String name;

    /**
     * (父菜单id,没有为null)
     *
     * @mbggenerated
     */
    private Integer parentid;

    /**
     * 是否启用(否0,是1)
     *
     * @mbggenerated
     */
    private Integer enabled;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
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

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", path=").append(path);
        sb.append(", component=").append(component);
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}