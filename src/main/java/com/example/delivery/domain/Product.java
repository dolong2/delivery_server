package com.example.delivery.domain;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue
    private Long Id;

    private String name;

    private int price;

    @OneToOne
    @JoinColumn(name="store_id")
    private Store store;
}
