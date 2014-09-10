package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by jr on 8/6/2014.
 * */

@Entity
@Table(name = "PledgeItem")
public class PledgeItem extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @NotNull
    @Column(name = "name", nullable = false, unique = false)
    private String name;

    @NotNull
    @Column(name = "quantity", nullable = false, unique = false)
    private Integer quantity;

    @NotNull
    @Column(name = "price", nullable = false, unique = false)
    private BigDecimal price;

    @NotNull
    @Column(name = "total", nullable = false, unique = false)
    private BigDecimal total;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "loan_id", referencedColumnName = "loan_id")
    private Pledge pledge;

    public PledgeItem(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Pledge getPledge() {
        return pledge;
    }

    public void setPledge(Pledge pledge) {
        this.pledge = pledge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
