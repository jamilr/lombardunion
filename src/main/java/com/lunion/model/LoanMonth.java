package com.lunion.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jr on 8/17/2014.
 */

@Entity
@Table(name = "LoanMonth")
public class LoanMonth extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "nominal_amount")
    private BigDecimal nominal_amount;

    @Column(name = "interest_rate_amount")
    private BigDecimal interest_rate_amount;

    @Column(name = "late_days_count")
    private Integer late_days_count;

    @Column(name = "loan_non_completion_days_count")
    private Integer loan_non_completion_days_count;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "status_id", referencedColumnName = "id", nullable = false)
    private LoanMonthStatus status;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "loan_id", referencedColumnName = "id")
    private Loan loan;

    public LoanMonth(){

    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public BigDecimal getNominal_amount() {
        return nominal_amount;
    }

    public void setNominal_amount(BigDecimal nominal_amount) {
        this.nominal_amount = nominal_amount;
    }

    public BigDecimal getInterest_rate_amount() {
        return interest_rate_amount;
    }

    public void setInterest_rate_amount(BigDecimal interest_rate_amount) {
        this.interest_rate_amount = interest_rate_amount;
    }

    public Integer getLate_days_count() {
        return late_days_count;
    }

    public void setLate_days_count(Integer late_days_count) {
        this.late_days_count = late_days_count;
    }

    public Integer getLoan_non_completion_days_count() {
        return loan_non_completion_days_count;
    }

    public void setLoan_non_completion_days_count(Integer loan_non_completion_days_count) {
        this.loan_non_completion_days_count = loan_non_completion_days_count;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LoanMonthStatus getStatus() {
        return status;
    }

    public void setStatus(LoanMonthStatus status) {
        this.status = status;
    }
}
