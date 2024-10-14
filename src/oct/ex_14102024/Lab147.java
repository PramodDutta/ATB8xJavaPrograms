package oct.ex_14102024;

public class Lab147 {
    public static void main(String[] args) {
        P p  = new P();
        p.f1();

        //I i = new I();

    }
}

class P implements I{

    @Override
    public void f1() {
        System.out.println("Created P");
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I{
    void f1();
    void f2();
    void f3();
}
