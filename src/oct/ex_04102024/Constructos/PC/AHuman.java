package oct.ex_04102024.Constructos.PC;

public class AHuman {
    String eyes_color;
    String planet = "AHuman";
    String name;
    long aadhar_card_number;


    // Default constructor
    AHuman(){
        System.out.println("I will be called, Object is created");
        // Write a Codee here which will automatically called when Object is created
        // Read a File txt
        // Read a CSV, Excel here. ....

    }



    // Parameterized Constructors
    AHuman(String name){
        System.out.println("Hi, I am Param Constructors");
        this.name = name;
    }


    // Return - void, data-type
    void walk(){
        System.out.println("NRNR");
    }

    int talk(){
        System.out.println("RTNA");
        return 10;
    }

    String sleep(String name){
        System.out.println("Sleeping");
        System.out.println("RTWA");
        return "I am sleeping";
    }

    void eat(String name){
        System.out.println("NRWA");
        System.out.println("Eat");
    }
}
