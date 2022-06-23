package by.itstep.vikvik.megashopproject.model.entity.abstracts;

import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
    private double price;
    private double calories;

    public Product() {
    }

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "price = " + price;
    }

    @Override
    public int compareTo(Product o) {
//        Дописать метод !!!!!!
        return 0;
    }
}
