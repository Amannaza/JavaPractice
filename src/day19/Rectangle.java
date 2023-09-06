package day19;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the length of the Rectangle:");
            int side = scan.nextInt();

            if (side <= 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the width of the Rectangle:");
            int width = scan.nextInt();

            if (width <= 0) {
                System.out.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            System.out.println("Area=" + (side * width));
            System.out.println("Perimeter=" + (2 * (side + width)));

            System.out.println("Would you like to calculate another Rectangle?");
            String ans = scan.next();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.err.println("Invalid answer.Would you like to continue?");
                ans = scan.next();
            }

            if (ans.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }
        }
        scan.close();

    }
}
