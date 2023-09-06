package day19;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();

            if (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.println("Area of sqare=" + (side * side));
            System.out.println("Perimeter of square=" + (4 * side));

            System.out.println("Would you like to calculate another Square?");
            String a = scan.next();


            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid entry.Please re-enter.Would you like to continue?");
                a = scan.next();
            }
            if (a.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }

        }


        scan.close();
    }
}
