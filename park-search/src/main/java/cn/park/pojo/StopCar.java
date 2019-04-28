package cn.park.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "stopcar",type = "stopcar",shards = 1,replicas = 0)
public class StopCar {
    @Id
    private Integer id;
    private String cname;
    private String aname;
    private String partName;
    private String carNumber;
    private Date beginTime;
    private Date endTime;
    private String vid;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "StopCar{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", aname='" + aname + '\'' +
                ", partName='" + partName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", vid='" + vid + '\'' +
                '}';
    }
}
