package Lectia9;

public class Student {
    String nume;
    double media;
    public Student(String name,double media){
        this.nume=name;
        this.media=media;
    }

    public String getNume() {
        return nume;
    }

    public double getMedia() {
        return media;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}