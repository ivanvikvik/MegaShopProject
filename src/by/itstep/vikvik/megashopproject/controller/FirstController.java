package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.util.HardcodeBasketBuilder;

public class FirstController extends  AbstractController{
    @Override
    public Basket createBasket() {
        return HardcodeBasketBuilder.createBasket();
    }
}
