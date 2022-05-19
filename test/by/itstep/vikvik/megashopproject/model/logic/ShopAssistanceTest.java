package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.Bread;
import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.container.DynamicBasket;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpatern.DynamicBasketIterator;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpatern.MyIterator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testCalculateTotalPrice(){
        Orange orange = new Orange(200, 3000, 4.5);
        Milk milk1 = new Milk(1000, 3.5, 2.5);
        Milk milk2 = new Milk(1000, 3.5, 2.5);
        Milk milk3 = new Milk(1000, 3.5, 2.5);
        Milk milk4 = new Milk(1000, 3.5, 2.5);
        Bread bread = new Bread("white", "best", 1.5);

        DynamicBasket basket = new DynamicBasket();
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);
        basket.add(milk4);
        basket.add(orange);
        basket.add(bread);

        MyIterator iterator = new DynamicBasketIterator(basket);

        double expected = 16;

        double actual = ShopAssistance.calculateTotalPrice(iterator);

        assertEquals(expected, actual, 0.0);

    }
}
