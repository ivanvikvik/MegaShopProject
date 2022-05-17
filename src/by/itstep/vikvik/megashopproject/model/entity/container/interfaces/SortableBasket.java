package by.itstep.vikvik.megashopproject.model.entity.container.interfaces;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public interface SortableBasket {
    int getProductCount();
    Product getProduct(int index);
    void setProduct(int index, Product product);
}
