import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduceți un număr: ");
       int numar = scanner.nextInt();


        if (numar > 0) {
            System.out.println("Numărul este pozitiv.");
        } else if (numar < 0) {
            System.out.println("Numărul este negativ.");
        } else {
            System.out.println("Numărul este zero.");
        }


        scanner.close();
    }
}