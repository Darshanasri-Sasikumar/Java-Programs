import java.util.Scanner;

public class reverseanArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array size");

        int arraysize = sc.nextInt();

        int arr[] = new int [arraysize];

        System.out.println("Enter the array elements");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the reversed elements");
        for(int i=0;i<arraysize/2;i++){
            int temp = arr[i];
            arr[i] = arr [arraysize-1-i];
           arr [arraysize-1-i] = temp;
        }
        
    }
    
}
