public class parameterizedmethod {
    public static void method(String name){

        System.out.println(name);

    }

    public static void age(int age , char grade){
        System.out.print(age+" "+grade);
    }

    public static void main(String[]args){
        method("Darsh");
        age(18, 'A');
    }


    
    
}
