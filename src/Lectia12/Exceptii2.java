package Main.java.Lectia12;

public class Exceptii2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{

        int result=a/b;

        System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Impartirea la zero nu exista");


        }

    }
}
