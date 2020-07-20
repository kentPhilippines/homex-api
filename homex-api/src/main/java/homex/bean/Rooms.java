package homex.bean;

import java.util.Date;

public class Rooms {
    private Long id;

    private String tower;

    private String unit;

    private Integer area;

    private Integer type;

    private String parking;

    private Integer condo_id;

    private Date update_time;

    private Date create_time;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking == null ? null : parking.trim();
    }

    public Integer getCondo_id() {
        return condo_id;
    }

    public void setCondo_id(Integer condo_id) {
        this.condo_id = condo_id;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}