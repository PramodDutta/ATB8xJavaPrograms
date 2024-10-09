package oct.ex_09102024_Inheritance.singleinheritance.ex1;

public class Son extends Father {
    // Son -> Father


    void bhk3(){
        System.out.println("3BHK");
        // Attribute Father
        System.out.println(gold_f);
        // Behaviour
        bhk2();
    }
}
