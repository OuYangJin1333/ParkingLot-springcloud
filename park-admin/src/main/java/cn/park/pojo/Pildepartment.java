package cn.park.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pildepartment {
    private Integer id;
    private  String name ;
    private  Integer parentId;
    private List<Pildepartment> nodes = new ArrayList();

    @Override
    public String toString() {
        return "Pildepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", nodes=" + nodes +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public List<Pildepartment> getNodes() {
        return nodes;
    }

    public void setNodes(List<Pildepartment> nodes) {
        this.nodes = nodes;
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


}
