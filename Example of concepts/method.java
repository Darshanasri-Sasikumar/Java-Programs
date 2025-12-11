public class method {

    /*
     * static = class level → can be accessed directly in main
     * non-static = object level → you must create object to access
     */

    // Static method
    public static void car() {
        System.out.println("My car is : Scala");
    }

    // Non-static method
    public void cars() {
        System.out.println("My car is : Scala");
    }

    public static void main(String[] args) {

        // Call static method directly
        car();

        // Call non-static method using object
        method obj = new method();
        obj.cars();
    }
}
