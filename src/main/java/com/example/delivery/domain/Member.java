package com.example.delivery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@AllArgsConstructor
public class Member {

    @Id
    @Column(name="member_id")
    @GeneratedValue
    private Long id;

    private String email;

    private String name;

    private String password;

    private int money;

    public Member() {

    }
}
