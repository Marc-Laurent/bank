package com.bank.account;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)

    private long user;
    @Column(nullable = false)

    private Double amount;

    public Integer ACC_VALEUR;

    private String ACC_TYPE;

    private String ACC_DEVISE;

    private String ACC_REFERENCE;

    private String ACC_LABEL;

    private String ACC_DESCRIPTION;

    private Date dateCreate;

    private Date dateUpdate;

    private Boolean is_valid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getACC_VALEUR() {
        return ACC_VALEUR;
    }

    public void setACC_VALEUR(Integer ACC_VALEUR) {
        this.ACC_VALEUR = ACC_VALEUR;
    }

    public String getACC_TYPE() {
        return ACC_TYPE;
    }

    public void setACC_TYPE(String ACC_TYPE) {
        this.ACC_TYPE = ACC_TYPE;
    }

    public String getACC_DEVISE() {
        return ACC_DEVISE;
    }

    public void setACC_DEVISE(String ACC_DEVISE) {
        this.ACC_DEVISE = ACC_DEVISE;
    }

    public String getACC_REFERENCE() {
        return ACC_REFERENCE;
    }

    public void setACC_REFERENCE(String ACC_REFERENCE) {
        this.ACC_REFERENCE = ACC_REFERENCE;
    }

    public String getACC_LABEL() {
        return ACC_LABEL;
    }

    public void setACC_LABEL(String ACC_LABEL) {
        this.ACC_LABEL = ACC_LABEL;
    }

    public String getACC_DESCRIPTION() {
        return ACC_DESCRIPTION;
    }

    public void setACC_DESCRIPTION(String ACC_DESCRIPTION) {
        this.ACC_DESCRIPTION = ACC_DESCRIPTION;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date date_create) {
        this.dateCreate = date_create;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date date_update) {
        this.dateUpdate = date_update;
    }

    public Boolean getIs_valid() {
        return is_valid;
    }

    public void setIs_valid(Boolean is_valid) {
        this.is_valid = is_valid;
    }
}
