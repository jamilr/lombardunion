package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by jr on 8/7/2014.
 */

@Entity
@Table(name = "UserType")
public class UserType extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "type_name")
    private String type_name;

    public UserType(){

    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
