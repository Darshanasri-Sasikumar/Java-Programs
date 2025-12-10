import java.util.Scanner;

public class leapyear {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year1");
        int year = sc.nextInt();

        
        if(year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("The Year is a Leep Year"+ year);
        }else{
            System.out.println("The Year is not a  Leep Year"+ year);

        }
    }
    
}
