package homex.bean;

import java.util.Date;

public class TodoEntity {
    private Integer id;

    private String todoId;

    private String authorId;

    private String condoId;

    private String toTower;

    private String unitMax;

    private String unitMin;

    private String subject;

    private Integer todoStatus;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private String content;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId == null ? null : todoId.trim();
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getCondoId() {
        return condoId;
    }

    public void setCondoId(String condoId) {
        this.condoId = condoId == null ? null : condoId.trim();
    }

    public String getToTower() {
        return toTower;
    }

    public void setToTower(String toTower) {
        this.toTower = toTower == null ? null : toTower.trim();
    }

    public String getUnitMax() {
        return unitMax;
    }

    public void setUnitMax(String unitMax) {
        this.unitMax = unitMax == null ? null : unitMax.trim();
    }

    public String getUnitMin() {
        return unitMin;
    }

    public void setUnitMin(String unitMin) {
        this.unitMin = unitMin == null ? null : unitMin.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(Integer todoStatus) {
        this.todoStatus = todoStatus;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}