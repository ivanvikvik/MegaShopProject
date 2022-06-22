package by.itstep.vikvik.megashopproject.model.entity;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.util.Objects;

public class Milk extends Product {
    private double volume;
    private double fat;

    public Milk() {
//        super(0);
    }

    public Milk(double volume, double fat, double price) {
        super(price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Milk)) return false;
        if (!super.equals(o)) return false;
        Milk milk = (Milk) o;
        return Double.compare(milk.volume, volume) == 0 && Double.compare(milk.fat, fat) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume, fat);
    }

    @Override
    public String toString() {
        return "Milk { " +
                "volume = " + volume +
                ", fat = " + fat +
                ", " + super.toString() + " }";
    }
}
