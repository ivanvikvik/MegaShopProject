package by.itstep.vikvik.megashopproject.model.entity;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.exception.ProductPriceWrongException;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class Orange extends Product {
    private int diameter;
    private int vitaminC;

    private static final long serialVersionUID = 1L;

//    private void writeObject(java.io.ObjectOutputStream out)
//            throws IOException {
//        out.defaultWriteObject();
//        out.writeDouble(getPrice());
//    }
//
//    private void readObject(java.io.ObjectInputStream in)
//            throws IOException, ClassNotFoundException {
//        in.defaultReadObject();
//        try {
//            setPrice(in.readDouble());
//        } catch (ProductPriceWrongException exception) {
//            System.err.println(exception);
//        }
//    }

//    public Orange() {
//        super(0);
//    }

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


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(diameter);
        out.writeInt(vitaminC);
        super.writeExternal(out);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        diameter = in.readInt();
        vitaminC = in.readInt();
        super.readExternal(in);
    }
}
