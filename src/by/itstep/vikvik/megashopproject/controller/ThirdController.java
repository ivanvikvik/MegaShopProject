package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.util.RandomBasketBuilder;

public class ThirdController extends AbstractController{
    @Override
    public Basket createBasket() {
        return RandomBasketBuilder.createBasket();
    }
}
