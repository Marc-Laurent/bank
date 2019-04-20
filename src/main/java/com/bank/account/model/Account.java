package com.bank.account.model;


import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

import java.util.Date;




@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private long user;
    @Column(nullable = false)
    private Double amount;
    private Integer ACC_VALEUR;
    private String ACC_TYPE;
    private String ACC_DEVISE;
    private String ACC_REFERENCE;
    private String ACC_LABEL;
    private String ACC_DESCRIPTION;
    private Date date_create;
    private Date date_update;
    private Boolean is_valid;



    public Account() {
    }

    public Account(long id, Integer user, Double amount,
                        Integer ACC_VALEUR, String ACC_TYPE,  String ACC_DEVISE,
                       String ACC_REFERENCE, String ACC_LABEL, String ACC_DESCRIPTION,
                       Date date_create, Date date_update, Boolean is_valid) {
        super();
        this.id = id;
        this.user = user;
        this.amount = amount;
        this.ACC_VALEUR =  ACC_VALEUR;
        this.ACC_TYPE =  ACC_TYPE;
        this.ACC_DEVISE =  ACC_DEVISE;
        this.ACC_REFERENCE =  ACC_REFERENCE;
        this.ACC_LABEL =  ACC_LABEL;
        this.ACC_DESCRIPTION =  ACC_DESCRIPTION;
        this.date_create =  date_create;
        this.date_update =  date_update;
        this.is_valid = is_valid;
    }

    /*************************** ID  ********************************/

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getuser() {
        return user;
    }
    public void setuser(Integer user) {
        this.user = user;
    }

    /*************************** VALUE ********************************/

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getValue() {
        return ACC_VALEUR;
    }
    public void setValue(Integer ACC_VALEUR) {
        this.ACC_VALEUR = ACC_VALEUR;
    }

    /*************************** STRING ********************************/

    public String getDevise() {
        return ACC_DEVISE;
    }
    public void setDevise(String ACC_DEVISE) {
        this.ACC_DEVISE = ACC_DEVISE;
    }

    public String getTReference() {
        return ACC_REFERENCE;
    }
    public void setReference(String ACC_REFERENCE) {
        this.ACC_REFERENCE = ACC_REFERENCE;
    }

    public String getLabel() {
        return ACC_LABEL;
    }
    public void setLabel(String ACC_LABEL) {
        this.ACC_LABEL = ACC_LABEL;
    }

    public String getDescription() { return ACC_LABEL; }
    public void setDescription(String ACC_DESCRIPTION) {
        this.ACC_DESCRIPTION = ACC_DESCRIPTION;
    }

    /*************************** DATE ********************************/

    public Date getdateCreate() {
        return date_create;
    }
    public void setdateCreate(Date date_create) {
        this.date_create = date_create;
    }
    public Date getDateAccount() {
        return date_update;
    }
    public void setDateAccount(Date date_update) {
        this.date_update = date_update;
    }

    /*************************** BOOLEAN ********************************/

    public Boolean getValidateAccount() {
        return is_valid;
    }
    public void setDateAccount(Boolean is_valid) {
        this.is_valid = is_valid;
    }


}
