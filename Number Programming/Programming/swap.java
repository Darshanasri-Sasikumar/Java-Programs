package Programming;
public class swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // ---------------------------------------------------------------------------------------------------------------------------------------------
        // using 3 variables
        System.out.println("The first Number is " + a);
        System.out.println("The Secound Number is  " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The swap first number is " + a);
        System.out.println("The swap Secounf number is " + b);
        // ----------------------------------------------------------------------------------------------------------------------------------------------------------
        // using Addition and Subtraction

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The swap first number is " + a);
        System.out.println("The swap Secounf number is " + b);

        // ---------------------------------------------------------------------------------------------------------------------------------------------------------

        // using Multiplication and Division
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("The swap first number is " + a);
        System.out.println("The swap Secounf number is " + b);

    }

}