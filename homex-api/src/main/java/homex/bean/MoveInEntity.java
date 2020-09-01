package homex.bean;

import java.util.Date;

public class MoveInEntity {
    private String id;

    private String userId;

    private String owner;

    private String condo;

    private String tower;

    private String unit;

    private String name;

    private String phone;

    private String email;

    private String moveIn;

    private String moveOut;

    private String status;

    private String broker;

    private String brokerPhone;

    private String photoList;

    private String operator;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getCondo() {
        return condo;
    }

    public void setCondo(String condo) {
        this.condo = condo == null ? null : condo.trim();
    }

    public String getTower() {
        return tower;
    }

    public void setTower(String tower) {
        this.tower = tower == null ? null : tower.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMoveIn() {
        return moveIn;
    }

    public void setMoveIn(String moveIn) {
        this.moveIn = moveIn == null ? null : moveIn.trim();
    }

    public String getMoveOut() {
        return moveOut;
    }

    public void setMoveOut(String moveOut) {
        this.moveOut = moveOut == null ? null : moveOut.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker == null ? null : broker.trim();
    }

    public String getBrokerPhone() {
        return brokerPhone;
    }

    public void setBrokerPhone(String brokerPhone) {
        this.brokerPhone = brokerPhone == null ? null : brokerPhone.trim();
    }

    public String getPhotoList() {
        return photoList;
    }

    public void setPhotoList(String photoList) {
        this.photoList = photoList == null ? null : photoList.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}