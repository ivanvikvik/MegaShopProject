package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.model.logic.ShopAssistance;
import by.itstep.vikvik.megashopproject.util.HardcodeBasketBuilder;

public class Main {
    public static void main(String[] args) {
        Basket basket = HardcodeBasketBuilder.createBasket();

        System.out.println(basket);

        double total = ShopAssistance.calculateTotalPrice(basket);
        System.out.println("Total price: " + total);

    }
}
