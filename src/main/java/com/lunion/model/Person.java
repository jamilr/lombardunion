package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jr on 8/6/2014.
 */

@Entity
@Table(name = "Person")
public class Person extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "pucode", nullable = false, unique = false)
    private String pucode;

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

    @Column(name = "img_path")
    private String img_path;

    @OneToOne(mappedBy="person", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval = true)
    private ContactInfo contactInfo;

    @OneToOne(mappedBy="person", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval = true)
    private EmploymentInfo employmentInfo;

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Loan> loanSet = new HashSet<Loan>(0);

    public Person() {
    }

    public String getPucode() {
        return pucode;
    }

    public void setPucode(String pucode) {
        this.pucode = pucode;
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

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public EmploymentInfo getEmploymentInfo() {
        return employmentInfo;
    }

    public void setEmploymentInfo(EmploymentInfo employmentInfo) {
        this.employmentInfo = employmentInfo;
    }

    public Set<Loan> getLoanSet() {
        return loanSet;
    }

    public void setLoanSet(Set<Loan> loanSet) {
        this.loanSet = loanSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
