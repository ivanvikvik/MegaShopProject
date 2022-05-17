package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.Bread;
import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.container.DynamicBasket;
import by.itstep.vikvik.megashopproject.model.entity.container.StaticBasket;
import by.itstep.vikvik.megashopproject.model.logic.BasketSorter;
import by.itstep.vikvik.megashopproject.model.logic.ShopAssistance;
import by.itstep.vikvik.megashopproject.model.logic.sortstrategy.SortByPriceAsc;
import by.itstep.vikvik.megashopproject.model.logic.sortstrategy.SortByPriceDesc;

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

        StaticBasket basket = new StaticBasket();
        basket.add(bread);
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);
        basket.add(milk4);
        basket.add(orange1);
        basket.add(orange2);
        basket.add(orange3);
        basket.add(orange4);
        basket.add(milk3);

        basket.remove(1);
        basket.remove(10);
        basket.remove(11);

//        BasketSorter.sort(basket, new SortByPriceAsc());
//        System.out.println(basket);
//
//        System.out.println();
//        BasketSorter.sort(basket, new SortByPriceDesc());
//        System.out.println(basket);
//
//        double total = ShopAssistance.calculateTotalPrice(basket);
//        System.out.println("Total price: " + total);

        System.out.println(basket);
    }
}
