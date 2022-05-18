package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.Bread;
import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.DynamicBasket;
import by.itstep.vikvik.megashopproject.model.entity.container.FixedBasket;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.ArrayIterator;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.DynamicBasketIterator;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.FixedBasketIterator;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.MyIterator;
import by.itstep.vikvik.megashopproject.model.logic.ShopAssistance;

public class Main {
    public static void main(String[] args) {
        Orange orange1 = new Orange(100, 2000, 2.5);
        Orange orange2 = new Orange(150, 2500, 3.5);
        Orange orange3 = new Orange(220, 3500, 6.5);
        Orange orange4 = new Orange(200, 3000, 4.5);
        Milk milk1 = new Milk(1000, 3.5, 2.5);
        Milk milk2 = new Milk(500, 3.2, 2.2);
        Milk milk3 = new Milk(5000, 2.5, 10.0);
        Milk milk4 = new Milk(1500, 1.0, 3.5);
        Bread bread = new Bread("White", "Best", 2.5);

        DynamicBasket basket = new DynamicBasket();
        basket.add(bread);
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);
        basket.add(milk4);

        Product[] products = new Product[]{milk1, bread, orange1};

        MyIterator iterator = new ArrayIterator(products);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.reset();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


//        basket.add(orange1);
//        basket.add(orange2);
//        basket.add(orange3);
//        basket.add(orange4);

//        for (int i = 0; i < basket.size(); i++) {
//            System.out.println(basket.get(i));
//        }

//        BasketSorter.sort(basket, new SortByPriceAsc());
//        System.out.println(basket);
//
//        System.out.println();
//        BasketSorter.sort(basket, new SortByPriceDesc());
//        System.out.println(basket);
//
        iterator.reset();
        double total = ShopAssistance.calculateTotalPrice(iterator);
        System.out.println("Total price: " + total);
    }
}
