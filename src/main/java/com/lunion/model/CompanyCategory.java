package com.lunion.model;

import javax.persistence.*;

/**
 * Created by jr on 8/18/2014.
 */

@Entity
@Table(name = "CompanyCategory")
public class CompanyCategory extends AbstractEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    public CompanyCategory() {
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
