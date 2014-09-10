package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by jr on 8/8/2014.
 */
@Entity
@Table(name = "PaymentType")
public class PaymentType extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name;

    public PaymentType(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
