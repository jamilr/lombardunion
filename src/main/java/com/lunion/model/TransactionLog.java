package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jr on 8/6/2014.
 */
@Entity
@Table(name = "TransactionLog")
public class TransactionLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "person_id")
    private Integer person_id;

    @NotNull
    @Column(name = "loan_id")
    private Integer loan_id;

    @NotNull
    @Column(name = "sum")
    private BigDecimal sum;

    @NotNull
    @Column(name = "currency_id")
    private Integer currency_id;

    @NotNull
    @Column(name = "when")
    private Date when;

    @NotNull
    @Column(name = "created")
    private Date created;

    @NotNull
    @Column(name = "last_modified")
    private Date last_modified;

    public TransactionLog(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public Integer getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(Integer loan_id) {
        this.loan_id = loan_id;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Integer getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Integer currency_id) {
        this.currency_id = currency_id;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
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
