package by.itstep.vikvik.megashopproject.controller;

import by.itstep.vikvik.megashopproject.model.entity.Bread;
import by.itstep.vikvik.megashopproject.model.entity.Milk;
import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.comparators.SortByPriceDesc;
import by.itstep.vikvik.megashopproject.model.entity.comparators.SortByValueDesc;
import by.itstep.vikvik.megashopproject.model.entity.container.DynamicBasket;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.ArrayIterator;
import by.itstep.vikvik.megashopproject.model.entity.iteratorpattern.MyIterator;

import java.util.*;

public class Main extends Object {

    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>(); //new LinkedList<>();

        // Queue<Integer> queue = new PriorityQueue<>(new SortByValueDesc()); //new LinkedList<>();
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

//
        Queue<Integer> queue = new ArrayDeque<>();
        Deque<Integer> deque = (Deque<Integer>) queue;
        deque.offer(22);
        deque.offer(13);
        deque.offer(4);
        deque.offer(5);
        deque.offer(6);

        while(!queue.isEmpty()){
            System.out.println(deque.removeFirst());
        }

//        qwertytrewq
//


//        Set<Integer> set = new HashSet<>();
        //Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
//
//        Integer[] arr = {1, 12, 4, 7, 23, 4, 5, 46, 7, 8};
//        Collections.addAll(set, arr);
//
//        System.out.println(set);


//        Test t = new Test();
//        t.<Integer>sum(3,2);
//
//        ArrayList<Integer> list = new ArrayList<>(); // since JDK 7.0
//
//        list = new LinkedList<>();
//        list = new Vector<>();
//
//        //1)
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//        //2)
//        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        //List<Integer> temp = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        List<Integer> temp = Arrays.asList(array);
//        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//
//        //3
//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        Collections.addAll(list, arr);


//        Orange orange1 = new Orange(100, 2000, 2.5);
//        Orange orange2 = new Orange(100, 2000, 2.6);
//        Orange orange3 = new Orange(100, 2000, 2.7);
//        Orang
//        qe orange2 = new Orange(150, 2500, 3.5);
//        Orange orange3 = new Orange(220, 3500, 6.5);
//        Orange orange4 = new Orange(200, 3000, 4.5);
//        Milk milk1 = new Milk(1000, 3.5, 2.5);
//        Milk milk2 = new Milk(500, 3.2, 2.2);
//        Milk milk3 = new Milk(5000, 2.5, 10.0);
//        Milk milk4 = new Milk(1500, 1.0, 3.5);
//        Bread bread = new Bread("White", "Best", 3.5);

//        DynamicBasket basket = new DynamicBasket();
//        basket.add(bread);
//        basket.add(milk1);
//        basket.add(milk2);
//        basket.add(milk3);
//        basket.add(milk4);
//
        //Product[] products = new Product[]{milk1, bread, orange1};
//        Product[] products = new Product[]{orange1, orange2, orange3, milk2, bread};
//
//        Set<Product> set = new TreeSet<>(new SortByPriceDesc());
//        Collections.addAll(set, products);
//        System.out.println(set);
//
//        set = new TreeSet<>();
//        Collections.addAll(set, products);
//        System.out.println(set);


//        MyIterator iterator = new ArrayIterator(products);
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        iterator.reset();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


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
//        iterator.reset();
//        double total = ShopAssistance.calculateTotalPrice(iterator);
//        System.out.println("Total price: " + total);
    }
}
