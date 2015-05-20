package wh.entity.reference;

import wh.entity.Entity;

public abstract class Reference extends Entity {

    private static final long serialVersionUID = 1L;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
