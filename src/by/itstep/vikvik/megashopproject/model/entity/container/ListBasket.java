package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public class ListBasket {
    private Node first;
    private int size;

    public ListBasket() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Product product) {
        if (isEmpty()) {
            first = new Node(product);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(product);
        }
        size++;
    }

    public boolean remove(int index) {
//        index считать с 0 или 1?
//        Будем с 0 как и в остальных контейнерах
        if (index > size - 1 || index < 0) {
            System.out.println("invalid index " + index);
            return false;
        } else if (index == 0) {
//            удаление первого элемента
            first = first.next;
        } else {
//            удаление всех остальных элементов
            Node temp = first;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node temp2 = temp.next;
            temp.next = temp2.next;

        }
        size--;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (isEmpty()) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");
            Node temp = first;
            while (temp.next != null) {
                builder.append("\n").append(temp.product);
                temp = temp.next;
            }
            builder.append("\n").append(temp.product);
        }
        return builder.toString();
    }

    private class Node {
        public Product product;
        public Node next;

        public Node(Product product) {
            this.product = product;
        }
    }
}
