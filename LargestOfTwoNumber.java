
import java.util.*;

public class LargestOfTwoNumber {

    public static void main(String[] args) {

        //jus using Conditional Statement

        int a = 10;
        int b = 20;
        if (a>b){
            System.out.println("The Larges Number is "+a);

        }else {
            System.out.println("The Largest Number is "+b);
        }

        // using Scanner Class

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number:");
        int c = sc.nextInt();

        System.out.println("Enter A Number");
        int d = sc.nextInt();

        if(a>b){
        System.out.println("A number is greate" + c);
        } else if(a<b){
        System.out.println("B number is greater" + d);
        }else {
        System.out.println("Both A and B are Equal");
        }

        // using Ternary Operator
        int e = 10;
        int f = 20;
        int largest = (e>f) ? e : f;
        System.out.println("The Largest Number is " + largest);

        // using Java Inbuild Method
        int first_number = 15;
        int Secound_number = 20;

        int Greatest = Math.max(first_number, Secound_number);

        System.out.println("Largest number = " + Greatest);

    }

}