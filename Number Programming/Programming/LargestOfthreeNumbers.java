package Programming;
import java.util.Scanner;

public class LargestOfthreeNumbers {
    public static void main(String[] args) {

        // using if else
        int a = 10, b = 20, c = 30;
        if (a >= b && a >= c) {
            System.out.println("The greates Number is" + a);
        } else if (b >= a && b > c) {
            System.out.println("The greates Number is" + b);
        } else if (c >= a && c >= b) {
            System.out.println("The greates Number is" + c);
        } else {
            System.out.println("They are equal");
        }

        // using Java build in Method
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("the greates Number is " + largest);

        // using Java Ternary Operator
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("the greates Number is " + greatest);

        // using Scanner Class

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int d = s.nextInt();

        System.out.println("Enter the number");
        int e = s.nextInt();

        System.out.println("Enter the number");
        int f = s.nextInt();

        if (d > e && d > f) {
            System.out.println("The Greates Number is " + d);
        } else if (e > d && e > f) {
            System.out.println("The Greates Number is " + e);
        } else
            System.out.println("The Greates Number is " + f);

    }

}
