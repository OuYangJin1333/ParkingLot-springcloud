package cn.park.pojo;

import java.io.Serializable;

public class PilStopInfoCharge implements Serializable {
    private Integer id;

    /**
     * 停车记录表id
     *
     * @mbggenerated
     */
    private Integer siid;

    /**
     * 收费金额
     *
     * @mbggenerated
     */
    private Double price;

    /**
     * 支付类型(App支付,停车场自收)
     *
     * @mbggenerated
     */
    private String paytype;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiid() {
        return siid;
    }

    public void setSiid(Integer siid) {
        this.siid = siid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", siid=").append(siid);
        sb.append(", price=").append(price);
        sb.append(", paytype=").append(paytype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}