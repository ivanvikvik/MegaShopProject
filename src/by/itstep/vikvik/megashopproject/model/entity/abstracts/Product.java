package by.itstep.vikvik.megashopproject.model.entity.abstracts;

import by.itstep.vikvik.megashopproject.model.exception.ProductPriceWrongException;

import java.io.*;
import java.util.Objects;

public class Product implements Comparable<Product>, Externalizable {
    private static final long serialVersionUID = 1L;

    private double price;

//    public Product() {
//    }

    public Product(double price) {
        this.price = price;
    }

    public Product(Product product) {
        price = product.price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws ProductPriceWrongException {
        if (price > 0) {
            this.price = price;
        } else {
            throw new ProductPriceWrongException();
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
        return Double.compare(o.price, price);

        //  private int id;
        //  private String name;

//        int number = Double.compare(o.price, price);
//
//        if (number == 0) {
//            number = Integer.compare(id, o.id);
//            if (number == 0) {
//                number = name.compareTo(o.name);
//                //optional
//                if (number == 0) {
//                    return 0;
//                }
//            }
//        }
//
//        return number;

//        if (price > o.price) {
//            return +1;
//        } else if (price < o.price) {
//            return -1;
//        } else {
//            return 0;
//        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeDouble(price);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        price = in.readDouble();
    }
}
