package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket implements Iterable {
    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public Basket(List<Product> list) {
        products = list;
    }

    public Product get(int index) {
        return products.get(index);
    }

    public void set(int index, Product product) {
        products.set(index, product);
    }

    public int size() {
        return products.size();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(int index) {
        products.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (products.size() == 0) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");

            for (Product product : products) {
                builder.append("\n").append(product);
            }
        }

        return builder.toString();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
