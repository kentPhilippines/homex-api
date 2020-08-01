package homex.bean;

import java.util.Date;

public class CondoTowerEntity {
    private Integer id;
    private String condoId;
    private String condoName;
    private String towerId;
    private String towerName;
    private Date createTime;
    private Date updataTime;
    private Integer status;
    private String remark;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCondoId() {
        return condoId;
    }

    public void setCondoId(String condoId) {
        this.condoId = condoId == null ? null : condoId.trim();
    }

    public String getCondoName() {
        return condoName;
    }

    public void setCondoName(String condoName) {
        this.condoName = condoName == null ? null : condoName.trim();
    }

    public String getTowerId() {
        return towerId;
    }

    public void setTowerId(String towerId) {
        this.towerId = towerId == null ? null : towerId.trim();
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName == null ? null : towerName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Date updataTime) {
        this.updataTime = updataTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}