package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.Iterable;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.ListBasketIterator;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.MyIterator;

public class ListBasket implements Basket, Iterable {
    private Node first;
    private int size;
    String s;

    public ListBasket() {
        first = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    @Override
    public Product get(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            return null;
        }

        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.product;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(Product product) {
        if (isEmpty()) {
            first = new Node(product);
        } else {
            Node temp = first;
            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(product);
        }

        size++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (isEmpty()) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");

            Node temp = first;
            while(temp.next != null) {
                builder.append("\n").append(temp.product);
                temp = temp.next;
            }

            builder.append("\n").append(temp.product);
        }

        return builder.toString();
    }

    @Override
    public MyIterator getIterator() {
        return new ListBasketIterator(new ListBasket());
    }

    private class Node {
        public Product product;
        public Node next;

        public Node(Product product){
            this.product = product;
        }

        public Node(){

        }
    }
}