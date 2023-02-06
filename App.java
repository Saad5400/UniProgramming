import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the first number as the count of numbers to be entered
        System.out.print("Enter the count of numbers, and then enter each number: ");
        int count = in.nextInt();

        // Initialize the first and second largest numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Read the numbers one by one and update max1 and max2 if a larger number is found
        for (int i = 0; i < count; i++) {
            int num = in.nextInt();
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        // Print the sum of max1 and max2
        System.out.println("Sum of the maximum two numbers: " + (max1 + max2));

        in.close();
    }
}
