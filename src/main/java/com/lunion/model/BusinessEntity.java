package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jr on 8/18/2014.
 */

@Entity
@Table(name = "BusinessEntity")
public class BusinessEntity extends AbstractEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id", nullable = false)
    private Address address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private CompanyCategory category;

    @NotNull
    @Column(name = "voen")
    private String voen;

    @NotNull
    @Past
    @Column(name = "voen_issue_date")
    private Date voen_issue_date;

    @NotNull
    @Past
    @Column(name = "start_date")
    private Date start_date;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "businessEntity")
    private Set<IncomeLog> incomeLogSet = new HashSet<IncomeLog>();

    public BusinessEntity(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getVoen() {
        return voen;
    }

    public void setVoen(String voen) {
        this.voen = voen;
    }

    public Date getVoen_issue_date() {
        return voen_issue_date;
    }

    public void setVoen_issue_date(Date voen_issue_date) {
        this.voen_issue_date = voen_issue_date;
    }

    public CompanyCategory getCategory() {
        return category;
    }

    public void setCategory(CompanyCategory category) {
        this.category = category;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Set<IncomeLog> getIncomeLogSet() {
        return incomeLogSet;
    }

    public void setIncomeLogSet(Set<IncomeLog> incomeLogSet) {
        this.incomeLogSet = incomeLogSet;
    }
}
