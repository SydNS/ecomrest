package com.example.ecomrest.domains.shops.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopid", nullable = false)
    private Long shopid;

    @Column(name = "shopName")
    private String shopName;

    @Column(name = "shopLocation")
    private String shopLocation;
}
