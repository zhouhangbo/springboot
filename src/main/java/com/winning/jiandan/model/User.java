package com.winning.jiandan.model;

import javax.persistence.*;

/**
 * Created by zhouhangbo on 2017/8/23.
 */
@Table(name = "user")
public class User {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
