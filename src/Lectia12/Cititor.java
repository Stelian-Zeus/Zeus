package Main.java.Lectia12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class Cititor {
    public static void main(String[] args) {
        String name= "zeus.txt";
        try(BufferedReader reader=new BufferedReader(new FileReader("zeus.txt"))
            }catch (FileNotFoundException e)
    }
}
