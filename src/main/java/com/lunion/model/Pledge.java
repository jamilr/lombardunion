package com.lunion.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jr on 8/6/2014.
 */

@Entity
@Table(name = "Pledge")
public class Pledge extends AbstractEntity {

    @Id
    @Column(name="loan_id", unique=true, nullable=false)
    @GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter( name="property", value="loan"))
    private Integer loan_id;

    @NotNull
    @Column(name = "total")
    private BigDecimal total;

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    private Loan loan;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "pledge")
    private Set<PledgeItem> pledgeItemSet = new HashSet<PledgeItem>(0);

    public Pledge(){

    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(Integer loan_id) {
        this.loan_id = loan_id;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Set<PledgeItem> getPledgeItemSet() {
        return pledgeItemSet;
    }

    public void setPledgeItemSet(Set<PledgeItem> pledgeItemSet) {
        this.pledgeItemSet = pledgeItemSet;
    }

}
