package sept.ex_23092024;

public class Lab078 {
    public static void main(String[] args) {
        // Switch Condition
        // Days - 1 to 7 ->  1 mon, 2 - tue, 7 - sun...
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("No idea, what day its");
        }
        System.out.println("End of the loop");

    }
}
