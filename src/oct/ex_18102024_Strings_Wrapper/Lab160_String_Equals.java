package oct.ex_18102024_Strings_Wrapper;

public class Lab160_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP
        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello"); // Object Area
        String s5 = new String("hello"); // Object Area

//        System.out.println(s1 == s2); // false
//        System.out.println(s2 == s3);
//        System.out.println(s1 == s4);


        // ==  This is checking the ref locations


        // How can I check the values? equals == value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));








    }
}
