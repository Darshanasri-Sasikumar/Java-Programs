import java.util.Scanner;

public class methodTask1 {

    public static void checkage(int age){
        if(age<18){
            System.out.println("You are not eligible to vote");
        }else{
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Age to Vote");
        int age = sc.nextInt();
        checkage(age);
    }
    
}
