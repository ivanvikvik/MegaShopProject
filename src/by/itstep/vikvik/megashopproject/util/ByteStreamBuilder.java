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
    private String fileName;



    public ByteStreamBuilder(String name) {
        this.fileName = name;
    }

    public void saveBasket(Basket basket) throws BasketFileNotFoundException {
        int[] array = {23,35,467,6787,80,546};

        if (fileName == null) {
            throw new BasketFileNotFoundException();
        }

        DataOutputStream stream = null;

        try {
            stream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));


            for (Product product : basket) {
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

            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            if (stream == null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    System.err.println(exception);
                }
            }
        }
    }

    public Basket createBasket() throws BasketFileNotFoundException {
        if (fileName == null) {
            throw new BasketFileNotFoundException();
        }

        Basket basket = new Basket();

        DataInputStream stream = null;

        try {
            stream = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(fileName)));


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

                basket.add(product);
            }

        } catch (EOFException exception) {
            //System.err.println(exception);
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            if (stream == null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    System.err.println(exception);
                }
            }
        }


        return basket;
    }
}
