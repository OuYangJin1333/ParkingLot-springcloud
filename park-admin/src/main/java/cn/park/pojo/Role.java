package cn.park.pojo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Role {
       @ApiModelProperty(   hidden = true)
      private  int   id;
      private  String  rname;
      private  Date createtime;
      @ApiModelProperty(   hidden = true)
      private  int  status;//是否启用    否为0 是为1
      @ApiModelProperty(   hidden = true)
      private  String  dname;
      private  String desc;
      @ApiModelProperty(   hidden = true)  //描述
      private  int departmentId;    //部门外键Id

    public String getRname() {
        return rname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setRname(String rname) {

        this.rname = rname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rname='" + rname + '\'' +
                ", createtime=" + createtime +
                ", status=" + status +
                ", dname='" + dname + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
