package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;

public class ShopAssistance {
    private ShopAssistance(){ }

    public static double calculateTotalPrice(Basket basket) {
        double total = 0;

        for (int i = 0; i < basket.getOrangesCount(); i++) {
            total += basket.getOrange(i).getCost();
        }

        for (int i = 0; i < basket.getMilksCount(); i++) {
            total += basket.getMilk(i).getMoney();
        }

        return total;
    }
}
