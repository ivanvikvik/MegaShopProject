package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.Iterable;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.MyIterator;

public class ShopAssistance {
    private ShopAssistance(){ }

    public static double calculateTotalPrice(Iterable iterable) {
        MyIterator iterator = iterable.getIterator();

        double total = 0;

        while(iterator.hasNext()){
            total += iterator.next().getPrice();
        }

        return total;
    }
}