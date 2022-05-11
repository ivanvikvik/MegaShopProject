package by.itstep.vikvik.megashopproject.model.logic.sortstrategy;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public class SortByPriceDesc implements ProductSortable{

    @Override
    public boolean compare(Product pr1, Product pr2) {
        return pr1.getPrice() < pr2.getPrice();
    }
}
