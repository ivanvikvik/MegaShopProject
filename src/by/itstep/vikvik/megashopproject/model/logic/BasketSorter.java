package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.Basket;
import by.itstep.vikvik.megashopproject.model.logic.sortstrategy.ProductSortable;

public class BasketSorter {
    public static void sort(Basket basket, ProductSortable sortable) {
        for (int i = 0; i < basket.size() - 1; i++) {
            for (int j = 0; j < basket.size() - 1 - i; j++) {
                if (sortable.compare(basket.get(j), basket.get(j + 1))) {
                    Product temp = basket.get(j);
                    basket.set(j, basket.get(j + 1));
                    basket.set(j + 1, temp);
                }
            }
        }
    }
}
