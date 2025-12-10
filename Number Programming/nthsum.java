import java.util.Scanner;

public class nthsum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        

        int sum = n*(n+1)/2;
        System.out.println("The Value is "+sum);

    }

    //nth number =if we give 5 = 1+2+3+4+5=15
    
}
