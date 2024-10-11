package oct.ex_11102024.superkeyword;

public class Lab139 {
    //     // super keyword in Java is a reference variable that allows
    // a sub class (child class to reference the parent class).


    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with Constructors

    public static void main(String[] args) {
        Car c = new Car();

    }

}

class Car extends Vehicle{
    private int maxSpeed = 281;

    void display(){
        System.out.println("Child");
    }


    Car(){
        super(10); // Constuctor Chaining
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        this.display(); // My own Display

        super.display(); // Parent Display
        System.out.println(super.maxSpeed);
    }
}

class Vehicle{
    public int maxSpeed = 180;

    void display(){
        System.out.println("Parent");
    }


    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }




}

