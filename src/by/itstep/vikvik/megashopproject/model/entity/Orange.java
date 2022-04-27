package by.itstep.vikvik.megashopproject.model.entity;

public class Orange {
    private int diameter;
    private int vitaminC;
    private double price;

    public Orange(){

    }

    public Orange(int diameter, int vitaminC, double cost) {
        this.diameter = diameter;
        this.vitaminC = vitaminC;
        this.price = cost;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double cost) {
        this.price = cost;
    }

    @Override
    public String toString() {
        return "Orange { " +
                "diameter = " + diameter +
                ", vitaminC = " + vitaminC +
                ", cost = " + price +
                " }";
    }
}
