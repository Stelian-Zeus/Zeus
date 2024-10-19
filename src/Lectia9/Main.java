package Lectia9;
import java.util.ArrayList;
public class Main   {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Vlad",5.5));
        students.add(new Student("Victor",7.5));
        students.add(new Student("Maria",8.5));
        students.add(new Student("Alexei",4.5));
        for (Student student:students){
            if(student.getMedia()>=8) {
                System.out.println(student.getNume()+" " +"Este la buget");
            }
            else if(student.media>=5){
                System.out.println(student.getNume()+" "+"Este la contract");
            }
            else {
                System.out.println(student.getNume()+" "+"exmatriculat");
                if (student.getNume().equals("Alexei")) {
                    student.setMedia(5.0);
                    System.out.println(student.getNume()+" "+student.getMedia());
                }
            }
        }
    }
}
