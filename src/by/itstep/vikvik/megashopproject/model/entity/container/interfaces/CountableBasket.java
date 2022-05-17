package by.itstep.vikvik.megashopproject.model.entity.container.interfaces;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public interface CountableBasket {
    int getProductCount();
    Product getProduct(int index);
}
