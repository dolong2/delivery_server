package com.example.delivery.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Store {
    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Long id;
    private String name;
    private String explanation;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member owner;
}
