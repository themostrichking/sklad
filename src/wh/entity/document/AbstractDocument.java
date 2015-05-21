package wh.entity.document;

import java.util.Date;

import wh.entity.Entity;

public abstract class AbstractDocument extends Entity {
    private static final long serialVersionUID = 1L;
    private Date date;
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
