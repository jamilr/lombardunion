package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jr on 8/6/2014.
 */
@Entity
@Table(name = "Loan")
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "person_id")
    private Integer person_id;

    @NotNull
    @Column(name = "sum")
    private BigDecimal sum;

    @NotNull
    @Column(name = "start_date")
    private Date start_date;

    @NotNull
    @Future
    @Column(name = "end_date")
    private Date end_date;

    @NotNull
    @Column(name = "month_count")
    private Integer month_count;

    @NotNull
    @Column(name = "created")
    private Date created;

    @NotNull
    @Column(name = "last_modified")
    private Date last_modified;

    public  Loan() {

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

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
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

    public Integer getMonth_count() {
        return month_count;
    }

    public void setMonth_count(Integer month_count) {
        this.month_count = month_count;
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
