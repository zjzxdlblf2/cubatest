package com.sjzl.wzgl.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "WZGL_HTMX")
@Entity(name = "wzgl_HTMX")
public class HTMX extends StandardEntity {
    private static final long serialVersionUID = 2615852382925929002L;

    @Column(name = "NAME")
    protected String name;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HT_ID")
    protected HT ht;

    @Column(name = "CLMC")
    protected String clmc;

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc;
    }

    public HT getHt() {
        return ht;
    }

    public void setHt(HT ht) {
        this.ht = ht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}