package oct.ex_09102024_Poly.methodoverloading;

public class Lab132 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println(result);


        String name = m.add("pramod","dutta");
        System.out.println(name);
    }
}
