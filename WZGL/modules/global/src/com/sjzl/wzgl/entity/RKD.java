package com.sjzl.wzgl.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.sjzl.framework.entity.BaseBill;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Entity(name = "wzgl_RKD")
public class RKD extends BaseBill {
    private static final long serialVersionUID = 1351305837363299249L;

    @Column(name = "JE")
    protected BigDecimal je;

    public BigDecimal getJe() {
        return je;
    }

    public void setJe(BigDecimal je) {
        this.je = je;
    }
}