import java.util.Scanner;

public class App {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Initialize two variables to store the maximum numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Initialize a variable to store the user's input
        int num;

        // Prompt the user to enter integers
        System.out.println("Enter integers (negative number to stop):");
        num = input.nextInt();

        // Keep looping until the user enters a negative number
        while (num >= 0) {
            // Check if the current input is larger than max1
            if (num > max1) {
                // If so, set max2 to the previous value of max1
                max2 = max1;
                // And set max1 to the current input
                max1 = num;
            } else if (num > max2) {
                // If the current input is not larger than max1 but is larger than max2,
                // set max2 to the current input
                max2 = num;
            }

            // Read the next input
            num = input.nextInt();
        }

        // Calculate and print the sum of the two maximum numbers
        System.out.println("Sum of maximum two integers: " + (max1 + max2));
    }
}