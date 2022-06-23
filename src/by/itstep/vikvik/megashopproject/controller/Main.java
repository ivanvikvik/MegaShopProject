package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;
import by.itstep.vikvik.megashopproject.util.serilezation.ProductSerializator;

import java.io.EOFException;

public class Main {
    public static void main(String[] args) throws BasketFileNotFoundException, EOFException {

        String fileName = "product.txt";

//        CharStreamBuilder builder = new CharStreamBuilder(fileName);
//
//        Basket basket = builder.createBasket();

        
        System.out.println("read = " + ProductSerializator.read());



//        System.out.println(basket);
//
//        double total = ShopAssistance.calculateTotalPrice(basket);
//        System.out.println("Total price: " + total);

    }
}
