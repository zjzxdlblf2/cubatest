package com.sjzl.wzgl.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.sjzl.framework.entity.BaseBill;

import javax.persistence.Column;
import javax.persistence.Entity;

@NamePattern("%s|name")
@Entity(name = "wzgl_SBGL")
public class SBGL extends BaseBill {
    private static final long serialVersionUID = -2510324171160522939L;

    @Column(name = "GGXH")
    protected String ggxh;

    public String getGgxh() {
        return ggxh;
    }

    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }
}