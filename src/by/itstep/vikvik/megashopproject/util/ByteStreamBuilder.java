package by.itstep.vikvik.megashopproject.util;

import by.itstep.vikvik.megashopproject.model.entity.Bread;
import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.ProductType;
import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;

import java.io.*;


public class ByteStreamBuilder {
    private final String fileName;

    public ByteStreamBuilder(String name) {
        this.fileName = name;
    }

    public void saveBasket(Basket basket) throws BasketFileNotFoundException {
        if (fileName == null) {
            throw new BasketFileNotFoundException();
        }

        try (DataOutputStream stream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)))) {

            for (Object product : basket) {
                if (product instanceof Orange orange) {
                    stream.writeInt(ProductType.ORANGE.ordinal());
                    stream.writeDouble(orange.getPrice());
                    stream.writeInt(orange.getDiameter());
                    stream.writeInt(orange.getVitaminC());
                } else if (product instanceof Milk milk) {
                    stream.writeInt(ProductType.MILK.ordinal());
                    stream.writeDouble(milk.getPrice());
                    stream.writeDouble(milk.getFat());
                    stream.writeDouble(milk.getVolume());
                } else if (product instanceof Bread bread) {
                    stream.writeInt(ProductType.BREAD.ordinal());
                    stream.writeDouble(bread.getPrice());
                    stream.writeUTF(bread.getColor());
                    stream.writeUTF(bread.getFlour());
                }
            }
            stream.flush();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public Basket createBasket() throws BasketFileNotFoundException {
        if (fileName == null) {
            throw new BasketFileNotFoundException();
        }
        Basket basket = new Basket();

        try (DataInputStream stream = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            int index;

            System.out.println(stream.available());
            while ( (stream.available()) != 0) {
                Product product = null;
                index = stream.readInt();
                System.out.println("index = " + stream.available());

                ProductType type = ProductType.values()[index];

                switch (type) {
                    case MILK -> {
                        double price = stream.readDouble();
                        double fat = stream.readDouble();
                        double volume = stream.readDouble();
                        product = new Milk(volume, fat, price);
                    }
                    case ORANGE -> {
                        double price = stream.readDouble();
                        int diameter = stream.readInt();
                        int vitaminC = stream.readInt();
                        product = new Orange(diameter, vitaminC, price);
                    }
                    case BREAD -> {
                        double price = stream.readDouble();
                        String color = stream.readUTF();
                        String flour = stream.readUTF();
                        product = new Bread(color, flour, price);
                    }
                }
                System.out.println(stream.available());
                basket.add(product);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return basket;
    }
}
