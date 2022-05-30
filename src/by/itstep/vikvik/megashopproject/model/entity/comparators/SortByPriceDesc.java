package by.itstep.vikvik.megashopproject.model.entity.comparators;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.util.Comparator;

public class SortByPriceDesc implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
