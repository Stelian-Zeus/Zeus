package Lectia9;
import java.util.ArrayList;

import java.util.ArrayList;

public class Angajati {
    public static void main(String[] args) {
        ArrayList<Angajati1> employees = new ArrayList<Angajati1>();

        employees.add(new Angajati1("Andy ", 4000.0));
        employees.add(new Angajati1("Maria ", 4500.0));
        employees.add(new Angajati1("Ion ", 3000.0));

        Angajati1 highestpaid = employees.get(0);
        for (Angajati1 a : employees) {
            if ( a.getSalary() > highestpaid.getSalary()) {
                highestpaid = a;}

                if (a.getName().equals("Andy ") ) {
                    a.setSalary(10000.0  );
                }
                System.out.println("Angajatul cu cel mai mare salariu este" + highestpaid.getSalary() + highestpaid.getName());
                System.out.println(a.getName() + " " + a.getSalary());
            }
        }

     //

    }



