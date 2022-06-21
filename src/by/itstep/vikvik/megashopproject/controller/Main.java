package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.model.logic.ShopAssistance;
import by.itstep.vikvik.megashopproject.util.ByteStreamBuilder;
import by.itstep.vikvik.megashopproject.util.CharStreamBuilder;
import by.itstep.vikvik.megashopproject.util.HardcodeBasketBuilder;
import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;

import java.io.EOFException;

public class Main {
    public static void main(String[] args) throws BasketFileNotFoundException, EOFException {

        String fileName = "product.txt";

        CharStreamBuilder builder = new CharStreamBuilder(fileName);

        Basket basket = builder.createBasket();

        System.out.println(basket);



//        System.out.println(basket);
//
//        double total = ShopAssistance.calculateTotalPrice(basket);
//        System.out.println("Total price: " + total);

    }
}
