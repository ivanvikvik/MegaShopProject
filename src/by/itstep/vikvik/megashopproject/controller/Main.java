package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.model.logic.ShopAssistance;
import by.itstep.vikvik.megashopproject.util.ByteStreamBuilder;
import by.itstep.vikvik.megashopproject.util.CharStreamBuilder;
import by.itstep.vikvik.megashopproject.util.HardcodeBasketBuilder;
import by.itstep.vikvik.megashopproject.util.RandomBasketBuilder;
import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;
import by.itstep.vikvik.megashopproject.util.serialization.BasketSerializator;

public class Main extends Object {

    public static void main(String[] args) throws BasketFileNotFoundException {

        int type = 0;

        Basket basket = SimpleBasketFactory.getFactory().create(type);

        System.out.println(basket);

        double total = ShopAssistance.calculateTotalPrice(basket);

        System.out.println("Total price: " + total);
    }
}
