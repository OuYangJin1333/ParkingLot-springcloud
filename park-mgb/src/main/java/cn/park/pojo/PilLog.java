package cn.park.pojo;

import java.io.Serializable;
import java.util.Date;

public class PilLog implements Serializable {
    private Integer id;

    /**
     * 时间
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * 管理员id
     *
     * @mbggenerated
     */
    private Integer aid;

    /**
     * 内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 功能
     *
     * @mbggenerated
     */
    private String function;

    /**
     * 结果
     *
     * @mbggenerated
     */
    private String result;

    /**
     * 终端名称
     *
     * @mbggenerated
     */
    private String terminalName;

    /**
     * 终端IP
     *
     * @mbggenerated
     */
    private String terminalIp;

    /**
     * mac地址
     *
     * @mbggenerated
     */
    private String mac;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", aid=").append(aid);
        sb.append(", content=").append(content);
        sb.append(", function=").append(function);
        sb.append(", result=").append(result);
        sb.append(", terminalName=").append(terminalName);
        sb.append(", terminalIp=").append(terminalIp);
        sb.append(", mac=").append(mac);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}