package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket implements Iterable<Product>, Serializable {
    private static final long serialVersionUID = 1L;

    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public Basket(List<Product> list) {
        products = list;
    }

    @Override
    public String toString()  {
        if (size() == 0) {
            return "Basket is empty";
        }

        StringBuilder builder = new StringBuilder("List of products: ");
        for (Product product : products) {
            builder.append("\n").append(product);
        }
        return builder + "";
    }

    public void add(Product product) {
        products.add(product);
    }

    public boolean remove(Product product) {
        return products.remove(product);
    }

    public int size() {
        return products.size();
    }

    public Product get(int index) {
        return products.get(index);
    }

    public void set(Product product, int index) {
        products.set(index, product);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
