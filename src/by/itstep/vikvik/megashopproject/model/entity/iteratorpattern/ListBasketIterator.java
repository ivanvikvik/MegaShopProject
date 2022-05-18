package by.itstep.vikvik.megashopproject.model.entity.iteratorpattern;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.ListBasket;

public class ListBasketIterator implements MyIterator {
    private ListBasket basket;
    private int current;

    public ListBasketIterator(ListBasket basket) {
        this.basket = basket;
    }

    @Override
    public Product next() {
        return basket.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < basket.size();
    }

    @Override
    public void reset() {
        current = 0;
    }
}
