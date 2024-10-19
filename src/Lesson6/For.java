package Lesson6;

public class For {
    public static void main(String[] args) {
        String banci[]={"Maib" , "Mobias" , "MOld" , "Victoria"};
         for (int i = 0; i < banci.length; i++) {}
        System.out.println(banci[1]);
        System.out.println(banci.length);

        banci[0]="Moldova";
        for (int j = 0; j < banci.length; j++)
        { System.out.println(banci[j]);}


    }
}
