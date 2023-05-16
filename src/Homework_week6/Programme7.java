package Homework_week6;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {

        double f,c;
        Scanner obj= new Scanner(System.in);
        System.out.print("f=");
        f = obj.nextInt();
        c = ((f-32)*5/9);

        System.out.println("Celsius ="+c);
    }
}
