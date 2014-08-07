package com.lunion.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jr on 8/6/2014.
 */
@Entity
@Table(name = "ContactInfo")
public class ContactInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "identity_passport")
    private Address identity_address;

    @Column(name = "current_passport")
    private Address current_address;

    @NotNull
    @Column(name = "mobile_phone")
    private String mobile_phone;

    @Column(name = "home_phone")
    private String  home_phone;

    @Column(name = "work_phone")
    private String  work_phone;

    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "created")
    private Date created;

    @NotNull
    @Column(name = "last_modified")
    private Date last_modified;

    public ContactInfo(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Address getIdentity_address() {
        return identity_address;
    }

    public void setIdentity_address(Address identity_address) {
        this.identity_address = identity_address;
    }

    public Address getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(Address current_address) {
        this.current_address = current_address;
    }

    public String getHome_phone() {
        return home_phone;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }

    public String getWork_phone() {
        return work_phone;
    }

    public void setWork_phone(String work_phone) {
        this.work_phone = work_phone;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(Date last_modified) {
        this.last_modified = last_modified;
    }
}
