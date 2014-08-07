package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jr on 8/6/2014.
 */

@Entity
@Table(
        name = "PersonIdentity",
        uniqueConstraints =
            @UniqueConstraint(columnNames={"number"}))
public class PersonIdentity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "number")
    private String number;

    @NotNull
    @Column(name = "issue_date")
    private Date issue_date;

    @NotNull
    @Column(name = "expire_date")
    private Date expire_date;

    @NotNull
    @Column(name = "issue_place")
    private String issue_place;

    @NotNull
    @Lob
    @Column(name = "img")
    private byte[] img;

    @NotNull
    @Column(name = "created")
    private Date created;

    @NotNull
    @Column(name = "last_modified")
    private Date last_modified;

    public PersonIdentity(){

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public Date getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getIssue_place() {
        return issue_place;
    }

    public void setIssue_place(String issuePlace) {
        this.issue_place = issuePlace;
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
