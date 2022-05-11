package by.itstep.vikvik.megashopproject.model.logic;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.Basket;

public class BasketSorter {
    public static void sortByPriceAsc(Basket basket) {
        for (int i = 0; i < basket.getProductCount() - 1; i++) {
            for (int j = 0; j < basket.getProductCount() - 1 - i; j++) {
                if (basket.getProduct(j).getPrice() > basket.getProduct(j + 1).getPrice()) {
                    Product temp = basket.getProduct(j);
                    basket.setProduct(j, basket.getProduct(j + 1));
                    basket.setProduct(j + 1, temp);
                }
            }
        }
    }

}
