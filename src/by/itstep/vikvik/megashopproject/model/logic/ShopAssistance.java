package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.iteratorpatern.MyIterator;

public class ShopAssistance {
    private ShopAssistance() {
    }

    public static double calculateTotalPrice(MyIterator iterator) {
        double total = 0;

        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }

        return total;
    }
}