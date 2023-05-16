package Homework_week6;

public class Calculator {

    public void addition (int a, int b){
        int sum = a+b;
        System.out.println("addition of "+a+"and"+b+"is ="+sum);

    }

    public void subtraction (int a, int b){
        int sub = a-b;
        System.out.println("subtraction of "+a+"and"+b+"is ="+sub);
    }

    public static void multiplication (int a,int b){
        int multi =a*b;
        System.out.println("Multiplication of "+a+" and"+b+" is="+multi);
    }
        public static void division (int a,int b){
        int div =a/b;
            System.out.println("Division of "+a+" and"+b+"is="+div );
        }

    public static void main(String[] args) {
        Calculator obj =new Calculator();
        obj.addition(20,5);
        obj.subtraction(20,5);
        multiplication(20,5);
        division(20,5);
    }
}

