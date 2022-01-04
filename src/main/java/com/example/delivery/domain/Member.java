package com.example.delivery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    @Column(name="member_id")
    @GeneratedValue
    private Long id;

    private String name;

    private String password;

    private int money;
}
