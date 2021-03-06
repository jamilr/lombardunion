package com.lunion.model;

import javax.persistence.*;

/**
 * Created by jr on 8/6/2014.
 */
@Entity
@Table(name = "ReasonType")
public class ReasonType extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public ReasonType(){

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
