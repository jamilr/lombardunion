package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jr on 8/6/2014.
 */

@Entity
@Table(name = "ReasonInfo")
public class ReasonInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "loan_id")
    private Integer loan_id;

    @NotNull
    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private ReasonType type;

    @Column(name = "remarks")
    private String remarks;

    @NotNull
    @Column(name = "created")
    private Date created;

    @NotNull
    @Column(name = "last_modified")
    private Date last_modified;

    public ReasonInfo(){

    }

    public Integer getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(Integer loan_id) {
        this.loan_id = loan_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public ReasonType getType() {
        return type;
    }

    public void setType(ReasonType type) {
        this.type = type;
    }
}
