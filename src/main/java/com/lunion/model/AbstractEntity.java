package com.lunion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by jr on 8/7/2014.
 */

@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractEntity implements IEntity {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Column(name = "created", columnDefinition = "DATEIIME", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @NotNull
    @Column(name = "last_modified", columnDefinition = "DATETIME", nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_modified;

     public AbstractEntity(){

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
