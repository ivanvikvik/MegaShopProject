package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange(200, 3000, 4.5);
        Milk milk = new Milk(1000, 3.5, 2.5);
        System.out.println(milk);
    }
}
