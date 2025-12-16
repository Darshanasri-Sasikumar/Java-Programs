import java.util.Scanner;

public class sumofArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int arrsize = sc.nextInt();

        int arr[] = new int [arrsize];

        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        

    }
    
}
