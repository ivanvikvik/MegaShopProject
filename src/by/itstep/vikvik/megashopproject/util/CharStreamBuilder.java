package by.itstep.vikvik.megashopproject.util;

import by.itstep.vikvik.megashopproject.model.entity.Bread;
import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.ProductType;
import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;

import java.io.*;

public class CharStreamBuilder {
    private String fileName;

    public CharStreamBuilder(String fileName) {
        this.fileName = fileName;
    }

    public void saveBasket(Basket basket) throws BasketFileNotFoundException {
        if (fileName == null) {
            throw new BasketFileNotFoundException();
        }

        try (Writer stream = new BufferedWriter(new FileWriter(fileName))) {

            for (Product product : basket) {
                if (product instanceof Orange) {
                    Orange orange = (Orange) product;
                    stream.write(ProductType.ORANGE.name() + " ");
                    stream.write(orange.getPrice() + " ");
                    stream.write(orange.getDiameter() + " ");
                    stream.write(orange.getVitaminC() + "\n");
                } else if (product instanceof Milk) {
                    Milk milk = (Milk) product;
                    stream.write(ProductType.MILK.name() + " ");
                    stream.write(milk.getPrice() + " ");
                    stream.write(milk.getFat() + " ");
                    stream.write(milk.getVolume() + "\n");
                } else if (product instanceof Bread) {
                    Bread bread = (Bread) product;
                    stream.write(ProductType.BREAD.name() + " ");
                    stream.write(bread.getPrice() + " ");
                    stream.write(bread.getColor() + " ");
                    stream.write(bread.getFlour() + "\n");
                }
            }

            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public Basket createBasket() throws BasketFileNotFoundException {
        if (fileName == null) {
            throw new BasketFileNotFoundException();
        }

        Basket basket = new Basket();

        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            Product product = null;

            String buf;
            while ((buf = stream.readLine()) != null) {

                String[] strings = buf.split(" ");
                ProductType type = ProductType.valueOf(strings[0]);

                switch (type) {
                    case MILK: {
                        double price = Double.parseDouble(strings[1]);
                        double fat = Double.parseDouble(strings[2]);
                        double volume = Double.parseDouble(strings[3]);
                        product = new Milk(volume, fat, price);
                    }
                    break;
                    case BREAD: {
                        double price = Double.parseDouble(strings[1]);
                        String color = strings[2];
                        String flour = strings[3];
                        product = new Bread(color, flour, price);
                    }
                    break;
                    case ORANGE: {
                        double price = Double.parseDouble(strings[1]);
                        int diameter = Integer.parseInt(strings[2]);
                        int vitamin = Integer.parseInt(strings[3]);
                        product = new Orange(diameter, vitamin, price);
                    }
                    break;
                }
                basket.add(product);
            }

        } catch (IOException exception) {
            System.err.println(exception);
        }

        return basket;
    }
}
