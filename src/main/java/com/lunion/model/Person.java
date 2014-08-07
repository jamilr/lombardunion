package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jr on 8/6/2014.
 */

@Entity
@Table(name = "Debtor")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "code")
    private String  code;

    @NotNull
    @Column(name = "first_name")
    private String  firstName;

    @NotNull
    @Column(name = "last_name")
    private String  lastName;

    @NotNull
    @Past
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date    dateOfBirth;

    @NotNull
    @Column(name = "person_identity_id")
    private Integer person_identity_id;

    @Lob
    @Column(name = "img")
    private byte[] img;

    @NotNull
    @Column(name = "created")
    private Date created;

    @NotNull
    @Column(name = "last_modified")
    private Date last_modified;

    public Person() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getPerson_identity_id() {
        return person_identity_id;
    }

    public void setPerson_identity_id(Integer person_identity_id) {
        this.person_identity_id = person_identity_id;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
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
