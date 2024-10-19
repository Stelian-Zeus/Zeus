package Lesson6;
import java.util.Arrays;

public class Maxmin {
    public static void main(String[] args) {
 //      int arr[]={5,3,9,10,11,13,4};
  //      int suma = arr[0];


//        int min = arr[0];
//        for(int i=1;i<arr.length;i++){
//            max=Math.max(max,arr[i]);
//            min=Math.min(min,arr[i]);
//        }
//        System.out.println("Maximum" +
//                "" + max);
//        System.out.println("Minimum" + min);



        int[] array = {50, 20, 40, 10, 30};


        System.out.println("Array-ul inițial:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }


            Arrays.sort(array);
        System.out.println( "Array in ordina crescatoara"+Arrays.toString(array));
        System.out.println( Arrays.toString(array));


//            System.out.println("\nArray-ul sortat în ordine crescătoare:");
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");


//                int[] array = {12, 23, 34, 45, 55};
//
//
//                int suma = 0;
//                for (int i = 0; i < array.length; i++) {
//                    suma += array[i];
//                }
//
//
//                System.out.println("Suma elementelor din array este: " + suma);


//
//                int[] array = {2, 5, 6, 7, 4, 44, 23, 3, 10, 12, 14, 13, 15, 17};
//
//
//                System.out.println("Numerele pare din array sunt:");
//                for (int i = 0; i < array.length; i++) {
//
//                    if (array[i] % 2 == 0)//pentru a vedea daca restul impartirii este 0 {
//                        System.out.println(array[i]);
//                    }

//
//        int[] array = {10, 20, 30, 40, 50};
//
//
//        System.out.println("Array-ul inițial:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//
//        int lungime = array.length;
//        for (int i = 0; i < lungime / 2; i++) {
//
//            int temp = array[i];
//            array[i] = array[lungime - 1 - i];
//            array[lungime - 1 - i] = temp;
//        }
//
//
//        System.out.println("\nArray-ul inversat:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//
//
//        }
        }}





