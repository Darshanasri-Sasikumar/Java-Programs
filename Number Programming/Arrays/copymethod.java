package Arrays;
import java.util.Arrays;

public class copymethod {

    
        public static void main(String[] args) {
           int [] a ={1,2,3};
           int [] b= Arrays.copyOf(a,a.length);
           System.out.println(Arrays.toString(b));
        }
    

}
