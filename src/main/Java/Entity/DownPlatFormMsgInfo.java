package Entity;

import java.math.BigInteger;

/**
 * Created by wangshy on 17/12/6.
 */
public class DownPlatFormMsgInfo {
    private Long id;
    private Long infoId;
    private String content;
    private Integer status;
    private String cretaeTime;
    private Integer objectType;
    private BigInteger objectId;
    private String tgroupId;
    private String lastsendtime;
    private String anstime;
    private String infoAns;
    private String supervision;
    private int fcount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public BigInteger getObjectId() {
        return objectId;
    }

    public void setObjectId(BigInteger objectId) {
        this.objectId = objectId;
    }

    public String getTgroupId() {
        return tgroupId;
    }

    public void setTgroupId(String tgroupId) {
        this.tgroupId = tgroupId;
    }

    public String getCretaeTime() {
        return cretaeTime;
    }

    public void setCretaeTime(String cretaeTime) {
        this.cretaeTime = cretaeTime;
    }

    public String getLastsendtime() {
        return lastsendtime;
    }

    public void setLastsendtime(String lastsendtime) {
        this.lastsendtime = lastsendtime;
    }

    public String getAnstime() {
        return anstime;
    }

    public void setAnstime(String anstime) {
        this.anstime = anstime;
    }

    public String getInfoAns() {
        return infoAns;
    }

    public void setInfoAns(String infoAns) {
        this.infoAns = infoAns;
    }

    public String getSupervision() {
        return supervision;
    }

    public void setSupervision(String supervision) {
        this.supervision = supervision;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    @Override
    public String toString() {
        return "DownPlatFormMsgInfo{" +
                "id=" + id +
                ", infoId=" + infoId +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", cretaeTime=" + cretaeTime +
                ", objectType=" + objectType +
                ", objectId=" + objectId +
                ", tgroupId='" + tgroupId + '\'' +
                ", lastsendtime=" + lastsendtime +
                ", anstime=" + anstime +
                ", infoAns='" + infoAns + '\'' +
                ", supervision='" + supervision + '\'' +
                ", fcount=" + fcount +
                '}';
    }
}
