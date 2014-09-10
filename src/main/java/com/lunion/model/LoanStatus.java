package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by jr on 9/9/2014.
 */

@Entity
@Table(name = "LoanStatus")
public class LoanStatus extends AbstractEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public LoanStatus(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
