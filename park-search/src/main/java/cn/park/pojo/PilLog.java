package cn.park.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * 日志记录表
 */
@Document(indexName = "pillog",type = "pillog",shards = 1,replicas = 0)
public class PilLog {
    @Id
    private int id;
    private Date time;
    private String aid;
    private String content;
    private String function;
    private String result;
    private String terminalName;
    private String terminalIp;
    private String mac;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
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
        return "PilLog{" +
                "id=" + id +
                ", time=" + time +
                ", aid='" + aid + '\'' +
                ", content='" + content + '\'' +
                ", function='" + function + '\'' +
                ", result='" + result + '\'' +
                ", terminalName='" + terminalName + '\'' +
                ", terminalIp='" + terminalIp + '\'' +
                ", mac='" + mac + '\'' +
                '}';
    }
}
