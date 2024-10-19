package Lesson3;

import java.util.Scanner;



public class lesson31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int numar = sc.nextInt();

        if (numar > 0) {
            System.out.println("Numarul este pozitiv");

        }
        else if (numar < 0) {
            System.out.println("Numarul este negativ");

        }

        else  {System.out.println("Numarul este zero");

        }
        sc.close();


    }



}
