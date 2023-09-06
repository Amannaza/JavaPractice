package day19;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Enter a radius of circle:");
            int radius = scan.nextInt();
            double PI = 3.14;

            if (radius <= 0) {
                System.err.println("Inva-lid Entry for the radius:" + radius);
                System.exit(0);
            }
            int diameter = radius * 2;
            double area = PI * radius * radius;
            double perimeter = 2 * PI * radius;

            System.out.println("Diameter is=" + diameter);
            System.out.println("Area=" + area);
            System.out.println("Perimeter=" + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String a = scan.next();

            if (a.equals("no")) {
                System.out.println("Thank you for using my calculator");
                break;
            }

            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Please enter valid answer.Would you like to calculate another circle?");
                a = scan.next();
            }


        }
    }
}