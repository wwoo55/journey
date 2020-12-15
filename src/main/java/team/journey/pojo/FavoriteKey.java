package team.journey.pojo;

import java.io.Serializable;

public class FavoriteKey implements Serializable {
    private Integer aid;

    private Integer rid;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}