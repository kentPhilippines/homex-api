package homex.bean;

public class RoomByUser {
    private Long id;

    private String hx_room_id;

    private String hx_userId;

    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHx_room_id() {
        return hx_room_id;
    }

    public void setHx_room_id(String hx_room_id) {
        this.hx_room_id = hx_room_id == null ? null : hx_room_id.trim();
    }

    public String getHx_userId() {
        return hx_userId;
    }

    public void setHx_userId(String hx_userId) {
        this.hx_userId = hx_userId == null ? null : hx_userId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}