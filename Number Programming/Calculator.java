import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();

        System.out.println("Enter the secound number");
        int b = sc.nextInt();

        System.out.println("Enter Your Choice");
        System.out.println("choice-1 :Addition +");
        System.out.println("choice-2 :Addition -");
        System.out.println("choice-3 :Addition *");
        System.out.println("choice-4 :Addition %");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Solution = " + (a + b));
                break;
            case 2:
                System.out.println("Solution =" + (a - b));
                break;

            case 3:
                System.out.println("Solution = " + (a * b));
                break;

            case 4:
                System.out.println("Solution = " + (a % b));
                break;

            default:
                break;
        }

    }

}
