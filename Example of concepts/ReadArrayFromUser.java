import java.util.Scanner;

public class ReadArrayFromUser {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //To get the size of an array
        System.out.println("enter the size of an array");
        int arrsize = sc.nextInt();

        int arr [] = new int [arrsize];

        //Read the elements in an arry

        System.out.println("elements"+" "+arrsize+" "+"array");
        for(int i =0;i<arr.length;i++){

             arr[i] = sc.nextInt();
            
        }
        //array elements
        System.out.println("Array elements are :");
        for (int i = 0; i<arrsize;i++){
            System.out.println(arr[i]);
        }
    }

   

    

}
