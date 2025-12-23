package Arrays;
import java.util.Arrays;

public class equalmethod {
    public static  void main(String[]args){
        int [] a ={1,2,3,4};
        int [] b= {1,2,3,4};

        System.out.println(a == b);
        System.out.println(Arrays.equals(a,b));
    }
    
}
