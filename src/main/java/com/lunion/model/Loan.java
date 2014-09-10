package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jr on 8/6/2014.
 */

@Entity
@Table(name = "Loan")
public class Loan extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "surety_first_id",referencedColumnName = "id", nullable = false)
    private Person suretyPersonFirst;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "surety_second_id", referencedColumnName = "id", nullable = true)
    private Person suretyPersonScnd;

    @Column(name = "is_business", nullable = false)
    private Boolean isBusiness;

    @NotNull
    @Column(name = "amount")
    private BigDecimal amount;

    @NotNull
    @Column(name = "duration")
    private Integer duration;

    @NotNull
    @Column(name = "interest_rate")
    private BigDecimal interest_rate;

    @NotNull
    @Column(name = "start_date")
    private Date start_date;

    @NotNull
    @Future
    @Column(name = "end_date")
    private Date end_date;

    @OneToOne(mappedBy="loan", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Pledge pledge;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id",  referencedColumnName = "id", nullable = false)
    private Person person;

    @OneToOne(mappedBy = "loan", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private LoanReason loanReason;

    @OneToMany(mappedBy = "loan", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<LoanMonth> loanMonthSet = new HashSet<LoanMonth>();

    public  Loan() {

    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BigDecimal getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(BigDecimal interest_rate) {
        this.interest_rate = interest_rate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pledge getPledge() {
        return pledge;
    }

    public void setPledge(Pledge pledge) {
        this.pledge = pledge;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getSuretyPersonScnd() {
        return suretyPersonScnd;
    }

    public void setSuretyPersonScnd(Person suretyPersonScnd) {
        this.suretyPersonScnd = suretyPersonScnd;
    }

    public Person getSuretyPersonFirst() {
        return suretyPersonFirst;
    }

    public void setSuretyPersonFirst(Person suretyPersonFirst) {
        this.suretyPersonFirst = suretyPersonFirst;
    }

    public Boolean getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public Set<LoanMonth> getLoanMonthSet() {
        return loanMonthSet;
    }

    public void setLoanMonthSet(Set<LoanMonth> loanMonthSet) {
        this.loanMonthSet = loanMonthSet;
    }

    public LoanReason getLoanReason() {
        return loanReason;
    }

    public void setLoanReason(LoanReason loanReason) {
        this.loanReason = loanReason;
    }
}
