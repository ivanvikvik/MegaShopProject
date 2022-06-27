package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.model.logic.ShopAssistance;

public abstract class AbstractController {

    // factory method
    public abstract Basket createBasket();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        AbstractController controller = (AbstractController) super.clone();

        return controller;
    }

    public void justDoIt() {
        Basket basket = createBasket();

        System.out.println(basket);

        double total = ShopAssistance.calculateTotalPrice(basket);

        System.out.println("Total price: " + total);

    }
}
