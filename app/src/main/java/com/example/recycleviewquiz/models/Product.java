package com.example.recycleviewquiz.models;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
    private int image;
    private boolean isFavourite;

    public Product(String name, double price, int image, boolean isFavourite) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.isFavourite = isFavourite;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }
}
