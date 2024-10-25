package oct.ex_23102024_Exception;

public class Lab178_Parent {
    public static void main(String[] args) {
        int b = 0; // ArithmeticException
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000 / a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
//        catch (Object e) { // Can't Use
//            System.out.println(e.getMessage());
//        }


    }
}
