package task;

public class Task_27_Sept_P1 {
    public static void main(String[] args) {
        int count = 0; // To keep track of how many even numbers we've printed
        int number = 2; // Start from the first even number

        do {
            if (number % 2 == 0) { // Check if the number is even
                System.out.println(number); // Print the current even number
                count++; // Increment the count of even numbers printed
            }
            number++; // Move to the next number
        } while (count < 5); // Continue until we've printed 5 even numbers
    }
    }

