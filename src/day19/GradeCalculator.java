package day19;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your score:");
            int score = scan.nextInt();

            while (!(score >= 0 && score <= 100)) {
                System.err.println("Invalid score");
                System.exit(0);
            }

            char grade = (score >= 90 && score <= 100) ? 'A' : (score >= 80 && score < 90) ? 'B' : (score >= 60 && score < 70) ? 'C' : (score >= 60 && score < 70) ? 'D' : 'F';
            System.out.println(grade);

            System.out.println("Would you like to continue?");
            String ans = scan.next();
            if (ans.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }

            if (!(ans.equals("yes") || ans.equals("no"))) {
                System.err.println("Invalid entry");
                System.exit(0);
            }

        }
        scan.close();
    }
}