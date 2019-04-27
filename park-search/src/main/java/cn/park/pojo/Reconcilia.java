package cn.park.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * 对账统计类
 */
@Document(indexName = "reconcilia",type = "reconcilia",shards = 1,replicas = 0)
public class Reconcilia {
    @Id
    private int id;
    private String cname;
    private String aname;
    private Date happen;
    private String payType;
    private Double price;
    private String describle;
    private String pname;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

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

    public Date getHappen() {
        return happen;
    }

    public void setHappen(Date happen) {
        this.happen = happen;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    @Override
    public String toString() {
        return "Reconcilia{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", aname='" + aname + '\'' +
                ", happen=" + happen +
                ", payType='" + payType + '\'' +
                ", price=" + price +
                ", describle='" + describle + '\'' +
                '}';
    }
}
