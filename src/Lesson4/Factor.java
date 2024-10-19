package Lesson4;
import java.util.Scanner;
public class Factor {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


            System.out.print("Introduceți un număr: ");
            int N = scanner.nextInt();


            boolean estePrim = true;
            int divizor = 2;


            do {
                if (N % divizor == 0) {
                    estePrim = false;
                    break;
                }
                divizor++;
            } while (divizor <= N / 2);
            if (N <= 1) {
                System.out.println(N + " nu e număr prim.");
            } else if (estePrim) {
                System.out.println(N + " este  număr prim.");
            } else {
                System.out.println(N + " nu e număr prim.");
            }


           scanner.close();

    }






}
