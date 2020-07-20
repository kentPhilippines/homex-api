package homex.bean;

import java.util.Date;

public class Condos {
    private Long id;

    private String condo_name;

    private String tower;

    private String phone;

    private String email;

    private String password;

    private Date create_time;

    private Date update_time;

    private String about;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCondo_name() {
        return condo_name;
    }

    public void setCondo_name(String condo_name) {
        this.condo_name = condo_name == null ? null : condo_name.trim();
    }

    public String getTower() {
        return tower;
    }

    public void setTower(String tower) {
        this.tower = tower == null ? null : tower.trim();
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Date update_time) {
        this.update_time = update_time;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }
}