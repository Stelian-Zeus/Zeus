package Lectia9;

import java.util.ArrayList;
import java.util.Arrays;

public class Lectia9 {

    public static void main(String[] args) {

                         // |numele arraiului-arraylist
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);
        arrayList.add(55);
        System.out.println(arrayList.get(0));
        arrayList.set(1,23);
        System.out.println(arrayList.get(1));
        arrayList.remove(1);
        System.out.println(arrayList.get(1));
        //lungime array
       // System.out.println(arrayList.size());
       // for (int i = 0; i < arrayList.size(); i++) {
         //   System.out.println(arrayList.get(i));
         //   arrayList.clear();
           // System.out.println(arrayList);

            int suma = 0;

            // Parcurgem array-ul folosind un ciclu for
            for (int i = 0; i < arrayList.size(); i++) {
                suma += arrayList.get(i);
            }
        }
    }

