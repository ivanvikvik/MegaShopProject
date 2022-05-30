package by.itstep.vikvik.megashopproject.model.entity;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.util.Objects;

public class Orange extends Product {
    private int diameter;
    private int vitaminC;
    String name;

    public Orange() {

    }

    public Orange(int diameter, int vitaminC, double price) {
        super(price);
        this.diameter = diameter;
        this.vitaminC = vitaminC;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orange)) return false;
        if (!super.equals(o)) return false;
        Orange orange = (Orange) o;
        return diameter == orange.diameter && vitaminC == orange.vitaminC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diameter, vitaminC);
    }

    @Override
    public String toString() {
        return "Orange { " +
                "diameter = " + diameter +
                ", vitaminC = " + vitaminC +
                ", " + super.toString() + " }";
    }
//
//    @Override
//    public int compareTo(Product o) {
//        if (getClass() != o.getClass()) return 1;
//        Orange orange = (Orange) o;
//        return name.compareTo(orange.name);
//    }
}
