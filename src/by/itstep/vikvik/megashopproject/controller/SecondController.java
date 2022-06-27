package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.util.serialization.BasketSerializator;

public class SecondController extends  AbstractController{
    @Override
    public Basket createBasket() {
        return BasketSerializator.read();
    }
}
