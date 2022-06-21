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
    private final String fileName;

    public CharStreamBuilder(String fileName) {
        this.fileName = fileName;
    }

    public void saveBasket(Basket basket) throws BasketFileNotFoundException {
//        if (fileName == null) {
//            throw new BasketFileNotFoundException();

        try (Writer stream = new BufferedWriter(new FileWriter(fileName))) {

            for (Object product : basket) {
                if (product instanceof Orange orange) {
                    stream.write(ProductType.ORANGE.name() + " ");
                    stream.write(orange.getPrice() + " ");
                    stream.write(orange.getDiameter() + " ");
                    stream.write(orange.getVitaminC() + "\n");
                } else if (product instanceof Milk milk) {
                    stream.write(ProductType.MILK.name());
                    stream.write(milk.getPrice() + " ");
                    stream.write(milk.getFat() + " ");
                    stream.write(milk.getVolume() + "\n");
                } else if (product instanceof Bread bread) {
                    stream.write(ProductType.BREAD.name() + " ");
                    stream.write(bread.getPrice() + " ");
                    stream.write(bread.getColor() + " ");
                    stream.write(bread.getFlour() + "\n");
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


        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            Product product = null;

            String buffer;

            while ( (buffer = stream.readLine()) != null){
                String[] strings = buffer.split(" ");
                ProductType type = ProductType.valueOf(strings[0]);

                switch (type) {
                    case MILK -> {
                        double price = Double.parseDouble(strings[1]);
                        double fat = Double.parseDouble(strings[2]);
                        double volume = Double.parseDouble(strings[3]);
                        product = new Milk(volume, fat, price);
                    }
                    case BREAD -> {
                        double price = Double.parseDouble(strings[1]);
                        String color = strings[2];
                        String flour = strings[3];
                        product = new Bread(color, flour, price);
                    }
                    case ORANGE -> {
                        double price = Double.parseDouble(strings[1]);
                        int diameter = Integer.parseInt(strings[2]);
                        int vitaminC = Integer.parseInt(strings[3]);
                        product = new Orange(diameter, vitaminC, price);
                    }
                }

            }


        } catch (IOException e) {
            System.err.println(e);
        }


        return basket;
    }
}
