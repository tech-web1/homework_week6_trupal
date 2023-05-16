package Homework_week6;

import java.util.Scanner;

public class Programme14 {
    public static  void main (String[] args){
        double h,w,area,peri;
        Scanner obj =new Scanner(System .in);
        System.out.print("h=");
        h = obj.nextDouble();
        System.out.print("w=");
        w = obj.nextDouble();
        area = h*w;
        peri = 2*(h+w);
        System.out.println("Area of rectangle ="+area);
        System.out.println("Parameter ="+peri);

    }

}
