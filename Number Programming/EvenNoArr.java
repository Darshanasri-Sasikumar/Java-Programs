import java.util.Scanner;

public class EvenNoArr {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int arraysize = sc.nextInt();

        int arr [] = new int [arraysize];

        System.out.println("enter the array elements");
        for(int i =0;i<arr.length;i++){
             arr [i]= sc.nextInt();
        }

        System.out.println("The array Elemets are :");
        for(int i =0;i<arraysize;i++){
            if(arr[i]%2==0){
                System.out.println("The Even Number in an array are :" + arr[i]);
            }
        }
    }
    
}
