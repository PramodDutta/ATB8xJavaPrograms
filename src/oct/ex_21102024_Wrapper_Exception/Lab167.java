package oct.ex_21102024_Wrapper_Exception;

public class Lab167 {
    public static void main(String[] args) {
        // Primitive to Wrapper class
        int a = 10;
        Integer b = a; // Boxing - int -> Integer
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        Integer a2 = 42;
        int value = a2; // Unboxing  - Integer -> int
        System.out.println(value);



    }
}
