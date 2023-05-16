package Homework_week6;

public class Programme1 {

    /**
     * Declare two instance variables
     * Declare one instance method
     * call both instance variables into the instance method inside the print statement
     * Declare the main method
     * call the above instance method into the main method and run the proramme
     *
     */





    int a = 12;
    int b = 8;


    public void m1(){
        Programme1 obj = new Programme1();

        System.out.println(obj.a);
        System.out.println(obj.b);

    }

    public static void main(String[] args) {
        Programme1 t=new Programme1();
        t.m1();
    }


}
