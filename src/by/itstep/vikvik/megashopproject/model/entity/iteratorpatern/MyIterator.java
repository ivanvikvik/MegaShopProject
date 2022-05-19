package by.itstep.vikvik.megashopproject.model.entity.iteratorpatern;
import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

public interface MyIterator {
    Product next();
    boolean hasNext();
    void reset();
}
