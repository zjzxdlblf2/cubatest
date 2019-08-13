package com.sjzl.framework.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.Group;

import javax.persistence.*;
import java.time.LocalDateTime;

@NamePattern("%s|name")
@Table(name = "FRAMEWORK_BASE_BILL")
@Entity(name = "framework_BaseBill")
public class BaseBill extends StandardEntity {
    private static final long serialVersionUID = 4703338892358920928L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "BIZDATE")
    protected LocalDateTime bizdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BZJG_ID")
    protected Group bzjg;

    public Group getBzjg() {
        return bzjg;
    }

    public void setBzjg(Group bzjg) {
        this.bzjg = bzjg;
    }

    public LocalDateTime getBizdate() {
        return bizdate;
    }

    public void setBizdate(LocalDateTime bizdate) {
        this.bizdate = bizdate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}