package Main.java.Lectia12;

public class Lectia12 {
    public static void main(String[] args) {
            try {
                int[] array = {1, 2, 3};
                System.out.println(array[4]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Acest index nu exista");
            }

            finally {
                System.out.println("Acest bloc are erori");

            }




    }
}
