package task;

public class Task_27_Sept {
    public static void main(String[] args) {
        // Print the First 5 Even Numbers
        int count = 1;
        int number = 2;
        do {
            System.out.println(number);
            number +=2;
            count++;
        }while (count <= 5);
    }
}
