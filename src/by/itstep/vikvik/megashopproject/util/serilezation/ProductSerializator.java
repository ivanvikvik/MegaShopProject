package by.itstep.vikvik.megashopproject.util.serilezation;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;

import java.io.*;

public class ProductSerializator {
    private static String filename;

    static {
        filename = "/Users/skynet/Desktop/Product.dat";
    }

    public static void write(Product product) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(filename)))) {

            stream.writeObject(product);

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static Product read() {
        Product product = null;
        try (ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(filename)))) {

            product = (Product) stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
        }
        return product;
    }
}
