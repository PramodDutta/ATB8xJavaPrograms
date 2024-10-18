package oct.ex_18102024_Strings_Wrapper;

public class Lab161_String_Functions {
    public static void main(String[] args) {

        String str = " Hello World ";
        // Length of the string
        System.out.println("Length: " + str.length());

        // Substring
        System.out.println("Substring: " + str.substring(0, 2));

        // Trim
        System.out.println("Trimmed: '" + str.trim() + "'"); // Outputs: "'Hello World'"

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase()); // Outputs: " HELLO WORLD "
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println(str.charAt(2));

        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));




        String name = " P r a m o d D u t t A";
        String name2 = "PramoD";
        System.out.println(name.compareTo(name2));
        // CompareTo -> 0 - both of them are same
        // Return Number -> ASCII value diff - between the Strings
        // d -> D - lexicographically comparasion

        System.out.println(name.strip());







    }
}
