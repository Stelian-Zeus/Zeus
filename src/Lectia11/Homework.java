package Main.java.Lectia11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduceți o linie de text: ");
        String userText = scanner.nextLine();

        try {

            FileWriter writer = new FileWriter("text.txt");


            writer.write(userText);


            writer.close();

            System.out.println("Textul a fost salvat în fișierul text.txt");

        } catch (IOException e) {

            System.out.println("A apărut o eroare la salvarea fișierului.");
            e.printStackTrace();
        }


        scanner.close();
    }
}