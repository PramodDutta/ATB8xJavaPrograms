package oct.ex_04102024.Constructos.PC;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    // Default Con
    Dog(){
        System.out.println("I am DC");
        System.out.println("God is happy!");
    }


    Dog(String breed){
        System.out.println("I am PC");
        this.breed = breed;
    }

    Dog(String breed,String name,int age, int legs){
        System.out.println("I am PC");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }



    void walk(){
    }
}
