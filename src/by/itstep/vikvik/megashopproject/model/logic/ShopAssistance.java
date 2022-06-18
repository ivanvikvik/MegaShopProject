package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.Basket;

import java.util.Iterator;

public class ShopAssistance {
    private ShopAssistance() {
    }

    public static double calculateTotalPrice(Iterable<Product> iterable) {
        Iterator<Product> iterator = iterable.iterator();
        double total = 0;
        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }
        return total;
    }
}