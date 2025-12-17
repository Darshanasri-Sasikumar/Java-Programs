package Programming;
public class Fibanacci {

    /*
     * 0+1=1
     * 0+1=1
     * 1+1=2
     * 1+2=3
     * 
     * 
     */
    public static void main(String[] args) {

        // n the term
        int n = 10;
        // intialising a
        int a = 1;

        // initalising b
        int b = 2;
        /*
         * Start the loop from 2
         * (Because first two numbers a and b already printed)
         */
        for (int i = 2; i < n; i++) {
            // Make a new number = sum of the last two numbers.
            int c = a + b;
            System.out.println(c + "");
            /*
             * Shift the numbers:
             * 
             * previous becomes second previous
             * 
             * new becomes previous
             */
            a = b;
            b = c;

        }
    }

    //using Scanner class

    /*
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("Enter A number");
        int a = sc.nextInt();

        System.out.println("enter B number");
        int b = sc.nextInt();

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c +" "+ "");

            a = b;
            b = c;
        }

    }
    
    
    */



}
