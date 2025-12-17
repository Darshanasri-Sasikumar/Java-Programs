package Programming;
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // 1️⃣ Using Ternary Operator
        int smallestTernary = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        // 2️⃣ Using If–Else
        int smallestIfElse;
        if (a <= b && a <= c) {
            smallestIfElse = a;
        } else if (b <= a && b <= c) {
            smallestIfElse = b;
        } else {
            smallestIfElse = c;
        }

        // 3️⃣ Using Math.min()
        int smallestMathMin = Math.min(a, Math.min(b, c));

        // Output
        System.out.println("\n--- Results ---");
        System.out.println("Smallest using Ternary Operator: " + smallestTernary);
        System.out.println("Smallest using If-Else Statement: " + smallestIfElse);
        System.out.println("Smallest using Math.min(): " + smallestMathMin);
    }
}
