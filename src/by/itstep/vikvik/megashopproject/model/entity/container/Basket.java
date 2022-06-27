package by.itstep.vikvik.megashopproject.model.entity.container;

import by.itstep.vikvik.megashopproject.model.entity.Bread;
import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.ProductType;
import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket implements Iterable<Product>, Externalizable {
    private static final long serialVersionUID = 1L;

    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public Basket(List<Product> list) {
        products = list;
    }

    @Override
    public String toString() {
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

    @Override
    public void writeExternal(ObjectOutput stream) throws IOException {
        for (Product product : products) {
            if (product instanceof Orange) {
                Orange orange = (Orange) product;
                stream.writeInt(ProductType.ORANGE.ordinal());
                stream.writeDouble(orange.getPrice());
                stream.writeInt(orange.getDiameter());
                stream.writeInt(orange.getVitaminC());
            } else if (product instanceof Milk) {
                Milk milk = (Milk) product;
                stream.writeInt(ProductType.MILK.ordinal());
                stream.writeDouble(milk.getPrice());
                stream.writeDouble(milk.getFat());
                stream.writeDouble(milk.getVolume());
            } else if (product instanceof Bread) {
                Bread bread = (Bread) product;
                stream.writeInt(ProductType.BREAD.ordinal());
                stream.writeDouble(bread.getPrice());
                stream.writeUTF(bread.getColor());
                stream.writeUTF(bread.getFlour());
            }
        }
    }

    @Override
    public void readExternal(ObjectInput stream) throws IOException, ClassNotFoundException {
        while (stream.available() != 0) {
            Product product = null;

            int index = stream.readInt();

            ProductType type = ProductType.values()[index];

            switch (type) {
                case MILK: {
                    double price = stream.readDouble();
                    double fat = stream.readDouble();
                    double volume = stream.readDouble();
                    product = new Milk(volume, fat, price);
                }
                break;
                case BREAD: {
                    double price = stream.readDouble();
                    String color = stream.readUTF();
                    String flour = stream.readUTF();
                    product = new Bread(color, flour, price);
                }
                break;
                case ORANGE: {
                    double price = stream.readDouble();
                    int diameter = stream.readInt();
                    int vitamin = stream.readInt();
                    product = new Orange(diameter, vitamin, price);
                }
                break;
            }

            products.add(product);
        }
    }
}
