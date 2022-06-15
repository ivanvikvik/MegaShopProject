package by.itstep.vikvik.megashopproject.util;

import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.Basket;

import java.util.Random;

public class RandomBasketBuilder {
    public static final int DEFAULT_PRODUCT_COUNT = 10;

    public static final double MAX_ORANGE_PRICE = 10;
    public static final double MIN_ORANGE_PRICE = 2;

    public static final int MAX_ORANGE_DIAMETER = 200;
    public static final int MIN_ORANGE_DIAMETER = 50;

    public static final int MAX_ORANGE_VITAMIN_C = 5000;
    public static final int MIN_ORANGE_VITAMIN_C = 100;

    public enum ProductType {
        ORANGE, MILK, BREAD
    }

    public static Basket createBasket(){
        Basket basket = new Basket();

        for (int i = 0; i < DEFAULT_PRODUCT_COUNT; i++) {
            Product product = createProduct();
            basket.add(product);
        }

        return basket;
    }

    private static Product createProduct(){
        Random random = new Random();
        Product product = null;

        ProductType type = ProductType.values()[random.nextInt(ProductType.values().length)];

        switch (type) {
            case ORANGE:
                double price = random.nextDouble() * MAX_ORANGE_PRICE;
                int diameter = random.nextInt(MAX_ORANGE_DIAMETER - MIN_ORANGE_DIAMETER + 1)
                        + MIN_ORANGE_DIAMETER;

                int vitamin = random.nextInt(MAX_ORANGE_VITAMIN_C - MIN_ORANGE_VITAMIN_C + 1)
                        + MIN_ORANGE_VITAMIN_C;

                product = new Orange(diameter, vitamin, price);

                break;
            case MILK:
                break;
            case BREAD:
                break;
        }


        return product;
    }

}
