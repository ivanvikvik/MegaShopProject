package by.itstep.vikvik.megashopproject.model.logic.sortstrategy;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public interface ProductSortable {
    boolean compare(Product pr1, Product pr2);
}
