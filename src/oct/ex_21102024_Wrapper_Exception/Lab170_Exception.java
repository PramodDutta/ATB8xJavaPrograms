package oct.ex_21102024_Wrapper_Exception;

public class Lab170_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip = args[0]; // 10 // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // 10 // NumberFormatException
        int b= 1000/a; // 100 // 0 ArithmeticException -> / by zero
        System.out.println(b); // 100
        System.out.println("End of the Program");

        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab170_Exception.main()
        //Now Control will be transferred from main Thread to main method

        // When problem comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program.





    }
}
