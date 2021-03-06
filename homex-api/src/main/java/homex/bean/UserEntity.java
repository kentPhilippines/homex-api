package homex.bean;

import java.util.Date;

public class UserEntity {
    private Integer id;
    private String sessionId;//token验证,目前先随便传递一个数据
    private String userId;
    private String userID;
    private String userName;
    private String userEmail;
    private String userPhone;
    private Integer userRole;
    private String userSlat;
    private String userPassword;
    private String password;
    private String createBy;
    private Date createTime;
    private Date updateTime;
    private Integer status;
    private String userAvtar;
    private String remark;
    public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
    	setUserID(userId);
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }
    public   void setUserPhone(String userPhone) {
          this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getUserSlat() {
        return userSlat;
    }

    public void setUserSlat(String userSlat) {
        this.userSlat = userSlat == null ? null : userSlat.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
    	setPassword(userPassword);
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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

    public String getUserAvtar() {
        return userAvtar;
    }

    public void setUserAvtar(String userAvtar) {
        this.userAvtar = userAvtar == null ? null : userAvtar.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + ", userRole=" + userRole + ", userSlat=" + userSlat + ", userPassword="
				+ userPassword + ", createBy=" + createBy + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", status=" + status + ", userAvtar=" + userAvtar + ", remark=" + remark + "]";
	}
    
}