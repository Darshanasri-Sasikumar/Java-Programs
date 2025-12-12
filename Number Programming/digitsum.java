public class digitsum {

    public static void main(String[]args){
        int num =12345;
        int digit = 0;
        while(num>0){
           int all = num %10;
            digit = digit +all;
            num =num/10;
        }

        System.out.println("num:"+digit);
    }
    
}
