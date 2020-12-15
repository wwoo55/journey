package team.journey.pojo;

import java.io.Serializable;
import java.util.Date;

public class Favorite extends FavoriteKey implements Serializable {
    private Date date;


    // customize
    private String title;
    private String name;
    private String strDate;

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static final long serialVersionUID = 1L;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}