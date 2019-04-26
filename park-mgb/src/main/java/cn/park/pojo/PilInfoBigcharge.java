package cn.park.pojo;

import java.io.Serializable;

public class PilInfoBigcharge implements Serializable {
    private Integer id;

    /**
     * 半小时收费
     *
     * @mbggenerated
     */
    private Double halfhour;

    /**
     * 第一个小时收费
     *
     * @mbggenerated
     */
    private Double ahour;

    /**
     * 超过一小时收费
     *
     * @mbggenerated
     */
    private Double moreone;

    /**
     * 一天最大收费
     *
     * @mbggenerated
     */
    private Double max;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getHalfhour() {
        return halfhour;
    }

    public void setHalfhour(Double halfhour) {
        this.halfhour = halfhour;
    }

    public Double getAhour() {
        return ahour;
    }

    public void setAhour(Double ahour) {
        this.ahour = ahour;
    }

    public Double getMoreone() {
        return moreone;
    }

    public void setMoreone(Double moreone) {
        this.moreone = moreone;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", halfhour=").append(halfhour);
        sb.append(", ahour=").append(ahour);
        sb.append(", moreone=").append(moreone);
        sb.append(", max=").append(max);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}