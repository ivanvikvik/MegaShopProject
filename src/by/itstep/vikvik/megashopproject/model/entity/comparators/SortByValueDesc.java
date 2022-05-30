package by.itstep.vikvik.megashopproject.model.entity.comparators;

import java.util.Comparator;

public class SortByValueDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1, o2);
    }
}
