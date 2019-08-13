package com.sjzl.wzgl.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.sjzl.framework.entity.BaseBill;

import javax.persistence.Column;
import javax.persistence.Entity;

@NamePattern("%s|name")
@Entity(name = "wzgl_HT")
public class HT extends BaseBill {
    private static final long serialVersionUID = 6148298620302980972L;

    @Column(name = "LXR")
    protected String lxr;

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }
}