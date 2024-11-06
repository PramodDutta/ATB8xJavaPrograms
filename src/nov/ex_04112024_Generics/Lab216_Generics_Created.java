package nov.ex_04112024_Generics;

public class Lab216_Generics_Created {
    public static void main(String[] args) {
        temp(12);
        temp(true);
        temp("Pramod");
        // T - Ref - It can be anything.

    }

    public static <T> void temp(T a) {
        System.out.println(a);
    }
}
