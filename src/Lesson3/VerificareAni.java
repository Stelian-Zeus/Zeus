package Lesson3;

import java.util.Scanner;

public class VerificareAni {
    public static void main(String[] args) {



        //creare scaner-introducere date de la tastatura
        Scanner sc = new Scanner(System.in);

        int anulCurent=2024;
        System.out.println("Introducetin anul nasterii");
        int anulNasterii=sc.nextInt();

        int varsta=anulCurent-anulNasterii;
        System.out.println("Varsta dumneavoastra este" +varsta);

        if (varsta>=0 && varsta <=12)
        {
            System.out.println("Grup de varsta: Copil");}
        else if (varsta>=12 && varsta <=18)
        {
            System.out.println("Grup de varsta: Adolescent");}
        else if (varsta>=18 && varsta <=60)
            System.out.println("Grup de varsta: Adult");
        else if (varsta>=60)
        {
            System.out.println("Grup de varsta: Senior");}

        sc.close();


    }
}
