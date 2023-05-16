package Homework_week6;

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj =new Scanner(System.in);
        System.out.print("a=");
        a = obj.nextInt();
        System.out.print("b=");
        b = obj.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
