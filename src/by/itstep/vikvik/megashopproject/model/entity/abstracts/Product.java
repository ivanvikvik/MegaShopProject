package by.itstep.vikvik.megashopproject.model.entity.abstracts;

public class Product {
    private double price;

    public Product() {
    }

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "price = " + price;
    }
}
