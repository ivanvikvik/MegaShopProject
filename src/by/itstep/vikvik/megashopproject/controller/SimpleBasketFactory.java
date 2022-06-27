package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.util.ByteStreamBuilder;
import by.itstep.vikvik.megashopproject.util.CharStreamBuilder;
import by.itstep.vikvik.megashopproject.util.HardcodeBasketBuilder;
import by.itstep.vikvik.megashopproject.util.RandomBasketBuilder;
import by.itstep.vikvik.megashopproject.util.exceptions.BasketFileNotFoundException;
import by.itstep.vikvik.megashopproject.util.serialization.BasketSerializator;

public class SimpleBasketFactory {
    private static SimpleBasketFactory factory;

    private SimpleBasketFactory(){

    }

    public static SimpleBasketFactory getFactory(){
        if (factory == null) {
            factory = new SimpleBasketFactory();
        }
        return factory;
    }

    public Basket create(int type) throws BasketFileNotFoundException {
        Basket basket = null;

        switch(type) {
            case 0 : basket = HardcodeBasketBuilder.createBasket(); break;
            case 1 : basket = BasketSerializator.read(); break;
            case 2: basket = new ByteStreamBuilder("D:/Test/stream.dat").createBasket(); break;
            case 3: basket = new CharStreamBuilder("D:/Test/stream.dat").createBasket(); break;
            default: basket = RandomBasketBuilder.createBasket();
        }

        return basket;
    }
}
