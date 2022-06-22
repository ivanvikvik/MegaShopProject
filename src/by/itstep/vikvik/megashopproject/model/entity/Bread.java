package by.itstep.vikvik.megashopproject.model.entity;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.util.Objects;

public class Bread extends Product {
    private String color;
    private String flour;

    public Bread() {
//        super(0);
    }

    public Bread(String color, String flour, double price) {
        super(price); // this();
        this.color = color;
        this.flour = flour;
    }

    public Bread(Bread bread){
        super(bread);
        color = bread.color;
        flour = bread.flour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bread)) return false;
        if (!super.equals(o)) return false;
        Bread bread = (Bread) o;
        return Objects.equals(color, bread.color) && Objects.equals(flour, bread.flour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, flour);
    }

    @Override
    public String toString() {
        return "Bread { " +
                "color = " + color +
                ", flour = " + flour +
                ", " + super.toString() + " }";
    }
}