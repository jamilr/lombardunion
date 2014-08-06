package com.lunion.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jr on 8/6/2014.
 */

@Entity
@Table(name = "EmploymentInfo")
public class EmploymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "person_id")
    private Integer person_id;

    @Column(name = "title")
    private String title;

    @Column(name = "department")
    private String department;

    @Column(name = "duties")
    private String duties;

    @Column(name = "employer_name")
    private String employer_name;

    @Column(name = "address")
    private Address employer_address;

    private String suervisor_first_name;

    private String supervisor_last_name;

    private String supervisor_mobile_phone;

    private String supervisor_work_phone;

    private String supervisor_email;

    private BigDecimal salary;

    private Integer currency_id;

    private Date start_date;

    private Date created;

    private Date last_modified;

}
