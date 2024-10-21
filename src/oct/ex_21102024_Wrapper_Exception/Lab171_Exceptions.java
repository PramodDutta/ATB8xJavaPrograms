package oct.ex_21102024_Wrapper_Exception;

import java.io.FileInputStream;

public class Lab171_Exceptions {
    public static void main(String[] args) {

        // Checked - JVM knows
//        FileInputStream file = new FileInputStream("C://a.txt");
        // JVm knows this that file may not exist


        // UnChecked Exception - ArithmeticException
        int a = 10;
        int c = a/0;
        System.out.println(c);



    }
}
