package by.itstep.vikvik.megashopproject.util.charstream;

import by.itstep.vikvik.megashopproject.model.entity.Orange;
import by.itstep.vikvik.megashopproject.model.exception.SomeTechnicalException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductStream {
    public static void writeOranges(Orange[] oranges, String fileName) {
        Writer writer = null;


        try {
            writer = new BufferedWriter(new FileWriter(fileName));

            // writer.write(oranges.length +"\n");

            for (Orange orange : oranges) {
                writer.write(orange.getPrice() + " ");
                writer.write(orange.getVitaminC() + " ");
                writer.write(orange.getDiameter() + "\n");
            }

            writer.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }
    }

    public static List<Orange> readOranges(String fileName) throws SomeTechnicalException {
        List<Orange> list = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));

            //int size = Integer.parseInt(reader.readLine());

            String buf = reader.readLine();

            int count = 0;



            while (buf != null) {

                count++;
                //if (buf != "")
                {
                    //for (int i = 0; i < size; i++) {
                    String[] parameters = buf.split(" "); //"3.5 2500 200".split() -> String[] "3.5" "2500" "200"
                    Orange orange = new Orange();
                    double price = Double.parseDouble(parameters[0]);
                    int vitamin = Integer.parseInt(parameters[1]);
                    int diameter = Integer.parseInt(parameters[2]);
                    orange.setPrice(price);
                    orange.setVitaminC(vitamin);
                    orange.setDiameter(diameter);
                    list.add(orange);
                    buf = reader.readLine();
                }

            }

            System.out.println("count = " + count);
        } catch (IOException exception) {
            SomeTechnicalException someTechnicalException = new SomeTechnicalException(exception)
            System.err.println(exception);
            throw someTechnicalException;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }

        return list;
    }
}
