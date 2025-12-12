
public class Arrayex1 {

    public static void main(String[]args){
      //1.  declaring an array:
        int[] arr  = {1,2,3,4,5}; 

       //2. To print one element 
        System.out.println(arr[1]);//2

        //3. To print array length
        System.out.println(arr.length);//5

        



        //To print every element
        System.out.println(arr);//it will give o/p like  [I@2f92e0f4
        //This is because arrays do not override toString().

        for(int i =0;i<arr.length;i++){
            System.out.print(i+" ");//0 1 2 3 4
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
    
}
