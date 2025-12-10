import java.util.Scanner;

public class Examplebreak {
    public static void main(String[] args) {

        // stop the loop when it reaches number 5
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // stop the loop when user enter 0
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            if (num == 0) {
                break; // stop the loop
            }
        }

    }

}
