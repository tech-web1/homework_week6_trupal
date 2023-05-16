package Homework_week6;

import java.util.Scanner;

public class Programme18 {
    int fn,sn,sum,mul,div,rem;

    public void addition (){
        Scanner obj =new Scanner(System.in);
        System.out.print("fn=");
        fn= obj.nextInt();
        System.out.print("sn=");
        sn= obj.nextInt();
        sum = fn + sn;
        System.out.println("sum="+sum);
    }
    public void subtraction (){
        int Sub = fn - sn;
        System.out.println("sub="+ Sub);

    }
    public void multiplication(){
        int mul = fn*sn;
        System.out.println("mul="+mul);
    }
    public void division(){
        int div = fn/sn;
        System.out.println("div="+div);
    }
    public void remainder(){
        int rem = fn%sn;
        System.out.println("rem="+rem);
    }

    public static void main(String[] args) {
        Programme18 obj =new Programme18();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        obj.remainder();
    }
}
