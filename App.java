import java.util.Scanner;

public class App {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int num;

        System.out.println("Enter integers (negative number to stop):");
        num = input.nextInt();

        while (num >= 0) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            num = input.nextInt();
        }

        System.out.println("Average of maximum two integers: " + (double)(max1 + max2) / 2);
    }
}