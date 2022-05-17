package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.container.DynamicBasket;

public class ShopAssistance {
    private ShopAssistance(){ }

    public static double calculateTotalPrice(DynamicBasket basket) {
        double total = 0;

        for (int i = 0; i < basket.getProductCount(); i++) {
            total += basket.getProduct(i).getPrice();
        }

        return total;
    }
}