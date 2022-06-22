package by.itstep.vikvik.megashopproject.util.serialization;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.Basket;

import java.io.*;

public class BasketSerializator {
    private static String fileName;

    static {
        fileName = "D:/Test/product.dat";
    }

    public static void write(Basket basket) {
        try(ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)))) {

            stream.writeObject(basket);

        }catch (IOException exception) {
            System.err.println(exception);
        }

    }

    public static Basket read() {
        Basket basket = null;

        try(ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {

            basket = (Basket)stream.readObject();

        }catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
        }

        return basket;
    }
}
