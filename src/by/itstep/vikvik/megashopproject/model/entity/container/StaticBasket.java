package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public class StaticBasket implements Basket {
    public static final int DEFAULT_SIZE = 10;

    private Product[] array;
    private int size;

    public StaticBasket() {
        array = new Product[DEFAULT_SIZE];
        size = 0;
    }

    public StaticBasket(int capacity){
        array = new Product[capacity];
        size = 0;
    }

    public StaticBasket(Product[] array){
        this.array = array;
        size = array.length;
    }

    public Product get(int index){
        return array[index];
    }

    public void setProduct(int index, Product product){
        array[index] = product;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return array.length;
    }

    public void add(Product product){
        if (product == null) {
            return;
        }

        if (size < array.length) {
            array[size] = product;
            size++;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void remove(int index){

        if (isEmpty() || (index < 0 && index >= size)) {
            return;
        }

        if (index == size - 1) {
            array[index] = null;
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
        }

        size--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (isEmpty()) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");

            for (int i = 0; i < size; i++) {
                builder.append("\n").append(array[i]);
            }
        }

        return builder.toString();
    }
}
