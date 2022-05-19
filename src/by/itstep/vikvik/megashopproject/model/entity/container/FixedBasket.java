package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public class FixedBasket implements Basket {
    private Product[] products;
    private int size;
    private static final int ARRAY_SIZE = 10;

    public FixedBasket() {
        products = new Product[ARRAY_SIZE];
        size = 0;
    }

    public FixedBasket(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    public FixedBasket(Product[] products) {
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
        if (index >= size || index < 0) {
            System.out.println("Написать исключение для выхода за пределы или попытки удаления уже и так пустого элемента");
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

    @Override
    public int size() {
        return size;
    }

    public Product get(int index) {
//        Сделать защиту!!!
        return products[index];
    }

    public void setProduct(int index, Product product) {
//        !!!
        products[index] = product;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (size == 0) {
            builder.append("Basket is empty.");
        } else {
            builder.append("FixedBasket:");

            for (int i = 0; i < size; i++) {
                builder.append("\n").append(products[i]);
            }
        }

        return builder.toString();
    }
}
