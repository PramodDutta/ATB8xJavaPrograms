package oct.ex_14102024.abstraction;

public class Lab150 {
}
interface I1{

    float PIE = 3.14f;

}
interface I2{}
class A{}
class B{}
class Test1 extends A{} // Single
//class Test2 extends A,B{ } // Multiple Never Possible using class
class Test3 implements I1{ }
class Test4 implements I1,I2{ } // Multiple Inheritance Interfaces
class Test5 extends A implements I1,I2{ }
//class Test6 implements I1 extends A{ }