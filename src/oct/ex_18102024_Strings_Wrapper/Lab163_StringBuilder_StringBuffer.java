package oct.ex_18102024_Strings_Wrapper;

public class Lab163_StringBuilder_StringBuffer {
    public static void main(String[] args) {
//        String name = "Pramod";
//        name = "Aramod";

        // final class StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuffer stringBuffer1 = new StringBuffer("Dutta");
        stringBuffer.append("Dutta");
        stringBuffer1.append("Pramod");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);


        // C1, C2 -> Toy
        //  C1 - Toy 2 -> C2 Toy ->2 - Syn - Thread Safty - Slow

        StringBuilder sb = new StringBuilder("Hello");

        // Appending to StringBuilder
        sb.append(" World");
        System.out.println(sb); // Outputs: Hello World

        // Inserting into StringBuilder
        sb.insert(5, ",");
        System.out.println(sb); // Outputs: Hello, World

        // Deleting from StringBuilder
        sb.delete(5, 6);
        System.out.println(sb); // Outputs: Hello World


        // Reversing StringBuilder
        sb.reverse();
        System.out.println(sb); // Outputs: dlroW olleH




    }
}
