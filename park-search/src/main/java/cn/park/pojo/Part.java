package cn.park.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 停车场信息
 */
@Document(indexName = "part",type = "part",shards = 1,replicas = 0)
public class Part {
    @Id
    private int id;           //id
    private String cname;        //城市
    private String aname;         //区域
    private String partName;       //停车场名称
    private String type;            //停车场类型
    private int count;           //总车位
    private int oldCount;            //剩余车位

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOldCount() {
        return oldCount;
    }

    public void setOldCount(int oldCount) {
        this.oldCount = oldCount;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", aname='" + aname + '\'' +
                ", partName='" + partName + '\'' +
                ", type='" + type + '\'' +
                ", count=" + count +
                ", oldCount=" + oldCount +
                '}';
    }
}
