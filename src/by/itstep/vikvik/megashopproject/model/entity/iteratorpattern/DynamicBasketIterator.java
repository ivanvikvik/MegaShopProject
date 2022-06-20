//package by.itstep.vikvik.megashopproject.model.entity.iteratorpattern;
//
//import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
//
//public class DynamicBasketIterator implements MyIterator {
//    private DynamicBasket basket;
//    private int current;
//
//    public DynamicBasketIterator(DynamicBasket basket) {
//        this.basket = basket;
//        current = 0;
//    }
//
//    @Override
//    public Product next() {
//        return basket.get(current++);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return current < basket.size();
//    }
//
//    @Override
//    public void reset() {
//        current = 0;
//    }
//
//}
