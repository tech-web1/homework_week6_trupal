package Homework_week6;

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        int a,b,c,sum,avg;
        Scanner obj = new Scanner(System.in);
        System.out.print("a=");
        a = obj.nextInt();
        System.out.print("b=");
        b = obj.nextInt();
        System.out.print("c=");
        c = obj.nextInt();
        sum = a+b+c;
        avg = sum/3;
        System.out.println("Average of three number ="+avg);

    }
}
