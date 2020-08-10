package homex.bean;

import java.util.Date;

public class UnitEntity {
    private Integer id;

    private String condoId;

    private String towerId;

    private String unitId;

    private String unitName;

    private String area;

    private String type;

    private String parking;

    private String owner;

    private String ownerContactNo;

    private String ownerIdCard;

    private String ownerEmail;

    private String spa;

    private String spaIdCard;

    private String spaContactNo;

    private String spaEmail;

    private String tenant;

    private String tenantIdCard;

    private String tenantContactNo;

    private String tenantEmail;

    private Date moveIn;

    private Date moveOut;

    private String broker;

    private String brokerContactNo;

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

    public String getTowerId() {
        return towerId;
    }

    public void setTowerId(String towerId) {
        this.towerId = towerId == null ? null : towerId.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking == null ? null : parking.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getOwnerContactNo() {
        return ownerContactNo;
    }

    public void setOwnerContactNo(String ownerContactNo) {
        this.ownerContactNo = ownerContactNo == null ? null : ownerContactNo.trim();
    }

    public String getOwnerIdCard() {
        return ownerIdCard;
    }

    public void setOwnerIdCard(String ownerIdCard) {
        this.ownerIdCard = ownerIdCard == null ? null : ownerIdCard.trim();
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail == null ? null : ownerEmail.trim();
    }

    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        this.spa = spa == null ? null : spa.trim();
    }

    public String getSpaIdCard() {
        return spaIdCard;
    }

    public void setSpaIdCard(String spaIdCard) {
        this.spaIdCard = spaIdCard == null ? null : spaIdCard.trim();
    }

    public String getSpaContactNo() {
        return spaContactNo;
    }

    public void setSpaContactNo(String spaContactNo) {
        this.spaContactNo = spaContactNo == null ? null : spaContactNo.trim();
    }

    public String getSpaEmail() {
        return spaEmail;
    }

    public void setSpaEmail(String spaEmail) {
        this.spaEmail = spaEmail == null ? null : spaEmail.trim();
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant == null ? null : tenant.trim();
    }

    public String getTenantIdCard() {
        return tenantIdCard;
    }

    public void setTenantIdCard(String tenantIdCard) {
        this.tenantIdCard = tenantIdCard == null ? null : tenantIdCard.trim();
    }

    public String getTenantContactNo() {
        return tenantContactNo;
    }

    public void setTenantContactNo(String tenantContactNo) {
        this.tenantContactNo = tenantContactNo == null ? null : tenantContactNo.trim();
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(String tenantEmail) {
        this.tenantEmail = tenantEmail == null ? null : tenantEmail.trim();
    }

    public Date getMoveIn() {
        return moveIn;
    }

    public void setMoveIn(Date moveIn) {
        this.moveIn = moveIn;
    }

    public Date getMoveOut() {
        return moveOut;
    }

    public void setMoveOut(Date moveOut) {
        this.moveOut = moveOut;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker == null ? null : broker.trim();
    }

    public String getBrokerContactNo() {
        return brokerContactNo;
    }

    public void setBrokerContactNo(String brokerContactNo) {
        this.brokerContactNo = brokerContactNo == null ? null : brokerContactNo.trim();
    }
}