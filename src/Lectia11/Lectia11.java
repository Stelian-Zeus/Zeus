package Main.java.Lectia11;

import java.io.*;

public class Lectia11 {
    public static void main(String[] args) throws IOException {
        String file = "examples.txt";
        File fisier = new File(file);
        if (fisier.createNewFile()) {
            System.out.println("fisier este creat");
        } else {
            System.out.println("fisier exista");
        }
        try(
                PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("Salut");
            writer.println(5+4);
        }
        try  (BufferedReader reader=new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }}}