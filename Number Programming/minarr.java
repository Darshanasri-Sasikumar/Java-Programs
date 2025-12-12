public class minarr {

    public static void main(String[]args){

        int arr[]={0,2,3,4,100};
        int min =arr[0];
        for (int i =1;i<arr.length;i++){
            if(arr[i]<min){
              min =  arr[i];
            }

        }

        System.out.println(min);

    }
    
}
