package Homework_week6;

public class Programme2 {
    /**
     * Declare two static variables
     * Declare one static method
     * Call both static variables into the static method inside the print statement
     * Declare the main method
     * Call the static method into the main method and run the programme
     */


    static int a =8;
    static int b = 12;

    public static void m1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Programme2.m1();  // static method calling
    }
}
