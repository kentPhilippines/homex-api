package homex.bean;

import java.util.Date;
import java.util.List;

public class AboutEntity {
    private Integer id;
    private String userId;
    private String time;
    private String phone;
    private String email;
    private String location;
    private String ruleId;
    private Date createTime;
    private Date updateTime;
    private Integer status;
    private String content;
    private String condoimgs;
    private String ruleText;
    
    
    private List<CondoTowerEntity> towerList;
    
    public List<CondoTowerEntity> getTowerList() {
		return towerList;
	}

	public void setTowerList(List<CondoTowerEntity> towerList) {
		this.towerList = towerList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCondoimgs() {
        return condoimgs;
    }

    public void setCondoimgs(String condoimgs) {
        this.condoimgs = condoimgs == null ? null : condoimgs.trim();
    }

    public String getRuleText() {
        return ruleText;
    }

    public void setRuleText(String ruleText) {
        this.ruleText = ruleText == null ? null : ruleText.trim();
    }
}