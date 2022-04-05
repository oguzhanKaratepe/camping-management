package com.ceo.campingmanager.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

