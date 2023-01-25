import java.util.Scanner;

/*
 * Lab 5
 * CS11211
 */

/*
* After the completion of this assignment, students should be able to: 
* Use different loop structures
* Use nested loops
*/


public class LAB_5 {
    /**
     * Write a code that draws a rectangular shaped garden or field area
     * then it calculates how much new lawn grass someone needs to buy
     * 
     * To determine the amount of turf that we might need, we multiply the length by the width; both in meters 
     * Then we add 10% just in case we have to fill any odd gaps that might pop-up!
     *
     * Ex: If the input numbers are:
     * 6 8
     *
     * the output is:
     *
     * ********
     * *      *
     * *      *
     * *      *
     * *      *
     * ********
     * We would need around 52.8 square meteres of turf
     *
     *
     * 
     * Ex: If the input numbers are:
     * 6 6
     *
     * the output is:
     *
     * ******
     * *    *
     * *    *
     * *    *
     * *    *
     * ******
     * We would need around 39.6 square meteres of turf
     *
     *
     * 
     * Note: use "nested-loop" while, do-while, or for to display the shape
     *    
     */

    public static void part1(){
        /* Write your code here */
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter height and width: ");

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        for (int row = 1; row <= height; row++) {

            for (int col = 1; col <= width; col++) {

                if (row == 1 || row == height) {
                    System.out.print('*');
                }
                else if (col == 1 || col == width) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }

            }

            System.out.println();

        }
        float size = height * width;
        size += size * 0.10;
        System.out.printf("We would need around %.1f square meteres of turf", size);
    }


    /**
     * Write a code that reads two integers, and whose output is 
     * the first integer and subsequent increments of 5 as long as
     * the value is less than or equal to the second integer.
     *
     * Ex: If the input is:
     * -15 10
     * the output is:
     * -15 -10 -5 0 5 10 
     * 
     * Ex: If the second integer is less than the first as in:
     * 20 5
     * 
     * the output is:
     * Second integer can't be less than the first.
     * 
     *
     * Note: For coding simplicity, output a space after every integer, including the last
     */

    public static void part2(){
        /* Write your code here */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Second integer can't be less than the first.");
            return;
        }

        while (start <= end) {
            System.out.print(start + " ");
            start += 5;
        }
        System.out.println();

    }

    public static void main(String [] cargs) {
        /** 
         * The following lines will run the code that you have implmented above
         * Currently, they are commented-out. You can uncomment to enble running
         * Each part individually as you code.
         */

        //part1();
        part2();
    }

}