package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public class StaticBasket {
    private Product[] products;
    private int size;
    private static final int ARRAY_SIZE = 10;

    public StaticBasket() {
        products = new Product[ARRAY_SIZE];
        size = 0;
    }

    public StaticBasket(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    public StaticBasket(Product[] products) {
        this.products = products;
        size = 0;  // на всякий случай

//        здесь нужно пробежаться циклом для определения size
//        доделать до конца!!!
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                size++;
            }
        }
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return products.length;
    }

    public void add(Product product) {
        if (product == null) {
            return;
        }
        if (size >= capacity()) {
            System.out.println("Basket is full!!!"); // Написать исключение!!!
            return;
        }
        products[size++] = product;
    }

    public boolean remove(int index) {
        if (index >= capacity() || index < 0) {
            System.out.println("Написать исключение!!!");
            return false;
        }

        if (index == size - 1) {
            products[index] = null;
        } else {
            for (int i = index; i < size - 1; i++) {
                products[i] = products[i + 1];
            }
            products[size - 1] = null;
        }
        size--;
        return true;
    }

    public Product getProduct(int index) {
//        Сделать защиту!!!
        return products[index - 1];
    }

    public void setProduct(int index, Product product) {
//        !!!
        products[index] = product;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (capacity() == 0) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");

            for (Product product : products) {
                if (product != null) {
                    builder.append("\n").append(product);
                }
            }
        }

        return builder.toString();
    }
}
