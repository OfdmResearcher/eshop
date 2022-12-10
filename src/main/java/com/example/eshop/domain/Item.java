package com.example.eshop.domain;

public class Item {

    private int id;
    private String title;
    private double price;

    public Item(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
