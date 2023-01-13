package org.example.entity;

import lombok.Builder;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "item_name")
    private String name;

    @Column(name = "item_price")
    private double price;

    public Item() {
    }

    public Item(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
