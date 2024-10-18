package oct.ex_18102024_Strings_Wrapper;

public class Test {
    public static void main(String[] args) {
        ABC a = new ABC();
        a.f1();
    }
}

class XYZ{
    void displays() {
        new ABC().f4();
    }
}

class ABC implements I1, I {

    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f2() {
        System.out.println("f2");
    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }

    @Override
    public void f20() {

    }

    @Override
    public void f10() {

    }
}


interface I {
    void f1();

    void f2();

    void f3();

    void f4();
}

interface I1 {
    void f20();

    void f10();
}