package by.itstep.vikvik.megashopproject.model.entity;

public class Orange {
    private int diameter;
    private int vitaminC;
    private double cost;

    public Orange(){

    }

    public Orange(int diameter, int vitaminC, double cost) {
        this.diameter = diameter;
        this.vitaminC = vitaminC;
        this.cost = cost;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
