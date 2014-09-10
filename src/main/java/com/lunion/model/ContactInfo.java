package com.lunion.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by jr on 8/6/2014.
 */
@Entity
@Table(name = "ContactInfo")
public class ContactInfo extends AbstractEntity {

    @Id
    @Column(name="person_id", unique=true, nullable=false)
    @GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters=@org.hibernate.annotations.Parameter( name="property", value="person"))
    private Integer person_id;

    @NotNull
    @Column(name = "mobile_phone")
    private String mobile_phone;

    @Column(name = "home_phone")
    private String  home_phone;

    @Column(name = "work_phone")
    private String  work_phone;

    @Column(name = "email")
    private String email;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Person person;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "identity_address_id", referencedColumnName = "id", nullable = true)
    private Address identity_address;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "current_address_id", referencedColumnName = "id", nullable = true)
    private Address current_address;

    public ContactInfo() {

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }
}
