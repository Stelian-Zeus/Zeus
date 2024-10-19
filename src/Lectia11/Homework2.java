package Main.java.Lectia11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework2 {
    public static void main(String[] args) {

        String fileName = "text.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(fileName));


            String firstLine = reader.readLine();


            if (firstLine != null) {
                System.out.println("Prima linie din fișier este: " + firstLine);
            } else {
                System.out.println("Fișierul este gol.");
            }


            reader.close();

        } catch (IOException e) {

            System.out.println("A apărut o eroare la citirea fișierului.");
            e.printStackTrace();
        }
    }
}