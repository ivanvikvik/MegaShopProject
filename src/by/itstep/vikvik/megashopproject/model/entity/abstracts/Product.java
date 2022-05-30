package by.itstep.vikvik.megashopproject.model.entity.abstracts;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private double price;
    private double calory;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "price = " + price;
    }

    @Override
    public int compareTo(Product o) {
//        return Double.compare(o.price, price);
        return Double.compare(price, o.price);
//        if (price > o.price) {
//            return +1;
//        } else if (price < o.price) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
