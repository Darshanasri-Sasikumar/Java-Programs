package Programming;
import java.util.Scanner;
public class SmallestOfTwoNumbers {
    public static void main(String[] args) {
        // using if statment
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println("The Smallest Number is " + a);
        } else if (b < a) {
            System.out.println("The Smallest Number is" + b);
        } else {
            System.out.println("Both Are Equal");
        }

        // using Ternary Operator
        int firstNumber = 11;
        int secoundNumber = 20;
        int smallest = (firstNumber < secoundNumber) ? firstNumber : secoundNumber;
        System.out.println("The smallest Number is " + smallest);

        // using Java inbuild function (Math.min)
        /*
         * 1.Math is the parent class of math.min
         * 2.it is used to compare values and return the smallest value
         */

        int one = 10;
        int two = 20;
        int lowest = Math.min(one, two);
        System.out.println("The smallest Number is " + lowest);

        //using Scanner Class
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int value1 = s.nextInt();

        System.out.println("Enter the Number:");
        int value2 = s.nextInt();

        if(value1<value2){
            System.out.println("The smallest Value is" +  value1);
        }else{
             System.out.println("The smallest Value is" +  value2);
        }
        

    }

}