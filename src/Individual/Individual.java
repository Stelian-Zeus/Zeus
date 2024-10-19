package Individual;



class Student {

    private String nume;
    private String prenume;
    private int varsta;
    private double[] note;

    public Student(String nume, String prenume, int varsta, double[] note) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.note = note;
    }


    public double calculeazaMedia() {
        double suma = 0;
        for (int i = 0; i < note.length; i++) {
            suma += note[i];
        }
        return suma / note.length;
    }


    public double gasesteNotaMaxima() {
        double max = note[0];
        for (int i = 1; i < note.length; i++) {
            if (note[i] > max) {
                max = note[i];
            }
        }
        return max;
    }


    public double gasesteNotaMinima() {
        double min = note[0];
        for (int i = 1; i < note.length; i++) {
            if (note[i] < min) {
                min = note[i];
            }
        }
        return min;
    }


    public void afiseazaDetalii() {
        System.out.println("Student: " + nume + " " + prenume);
        System.out.println("Vârsta: " + varsta);
        System.out.println("Media notelor: " + calculeazaMedia());
        System.out.println("Nota maximă: " + gasesteNotaMaxima());
        System.out.println("Nota minimă: " + gasesteNotaMinima());
    }
}

public class Individual {
    public static void main(String[] args) {

        double[] note = {8.5, 9.0, 7.5, 10.0, 6.5};


        Student student1 = new Student("Popescu", "Ion", 20, note);


        student1.afiseazaDetalii();
    }
}