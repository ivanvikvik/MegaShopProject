package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.util.HardcodeBasketBuilder;
import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;
import by.itstep.vikvik.megashopproject.util.serialization.BasketSerializator;

public class Main extends Object {

    public static void main(String[] args) throws BasketFileNotFoundException {
//        Product product = new Orange(100, 3000, 2.5);
//
//        BasketSerializator.write(product);

//        Product newProduct = BasketSerializator.read();
//
//        System.out.println(newProduct);


        Basket basket = HardcodeBasketBuilder.createBasket();

        BasketSerializator.write(basket);

        System.out.println(BasketSerializator.read());



//        String fileName = "d:/Test/product.bin";
//        String fileName = "d:/Test/product.txt";
//
//        CharStreamBuilder builder = new CharStreamBuilder(fileName);
        //builder.saveBasket(basket);
//        Basket basket = builder.createBasket();

        //ByteStreamBuilder byteStreamBuilder = new ByteStreamBuilder(fileName);
        //byteStreamBuilder.saveBasket(basket);

        //Basket basket = byteStreamBuilder.createBasket();

//        System.out.println(basket);
//
//        double total = ShopAssistance.calculateTotalPrice(basket);
//
//        System.out.println("Total price: " + total);
    }
}
