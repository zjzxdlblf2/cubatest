package com.sjzl.wzgl.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.sjzl.framework.entity.BaseBill;

import javax.persistence.Column;
import javax.persistence.Entity;

@NamePattern("%s|name")
@Entity(name = "wzgl_CKD")
public class CKD extends BaseBill {
    private static final long serialVersionUID = -2920341919663331066L;

    @Column(name = "GYS")
    protected String gys;

    public String getGys() {
        return gys;
    }

    public void setGys(String gys) {
        this.gys = gys;
    }
}