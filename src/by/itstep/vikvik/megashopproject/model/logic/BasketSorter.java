package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.interfaces.SortableBasket;
import by.itstep.vikvik.megashopproject.model.logic.sortstrategy.ProductSortable;

public class BasketSorter {
    public static void sort(SortableBasket basket, ProductSortable sortable) {
        for (int i = 0; i < basket.getProductCount() - 1; i++) {
            for (int j = 0; j < basket.getProductCount() - 1 - i; j++) {
                if (sortable.compare(basket.getProduct(j), basket.getProduct(j + 1))) {
                    Product temp = basket.getProduct(j);
                    basket.setProduct(j, basket.getProduct(j + 1));
                    basket.setProduct(j + 1, temp);
                }
            }
        }
    }
}
