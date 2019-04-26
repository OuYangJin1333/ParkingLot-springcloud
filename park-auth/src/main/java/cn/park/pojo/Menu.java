package cn.park.pojo;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    private int id;
    private String url; //  访问路径
    private String path; // 路径
    private String component; //  组件包名
    private String name ;
    private int parentId;  //  (父菜单id,没有为null)
    private int enabled ;// 是否启用(否0,是1)
    private List<Role> roles;
    private List<Menu> children;
    private MenuMeta meta;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public MenuMeta getMeta() {
        return meta;
    }

    public void setMeta(MenuMeta meta) {
        this.meta = meta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
