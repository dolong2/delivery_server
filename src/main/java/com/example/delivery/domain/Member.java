package com.example.delivery.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter
public class Member {
    public Member() {
    }

    @Id
    @Column(name="member_id")
    @GeneratedValue
    private Long id;

    private String email;

    private String name;

    private String password;

    private int money;
}
