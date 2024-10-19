package Main.java;

import java.util.Scanner;
class Switch {
    public static void main(String[] args) {
        Scanner nr1=new Scanner(System.in);
        System.out.println("introduceti primul nr.");
        int num1=nr1.nextInt();
        Scanner nr2=new Scanner(System.in);
        System.out.println("introduceti al doilea nr.");
        int num2=nr2.nextInt();
        Scanner op1=new Scanner(System.in);
        System.out.println("operatorul");
        char opr =op1.next().charAt(0);
        switch(opr){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;

        }
    }
}





