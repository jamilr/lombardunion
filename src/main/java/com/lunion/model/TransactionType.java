package com.lunion.model;

import javax.persistence.*;

/**
 * Created by jr on 8/8/2014.
 */

@Entity
@Table(name = "TransactionType")
public class TransactionType extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public TransactionType(){

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
