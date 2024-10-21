package oct.ex_21102024_Wrapper_Exception;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
        Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a; // Unboxing

        // String to Primitive?
        int a3 = Integer.parseInt(num);

        // int a = 10; -> these are not class or object
        // Integer -> Collection Framework (You can use Class and Object)


    }
}
