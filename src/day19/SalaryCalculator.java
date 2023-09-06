package day19;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("How much you make an hour?");
            int hourRate = scan.nextInt();

            if (hourRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int hoursWeekly = scan.nextInt();

            if (hoursWeekly <= 1 && hoursWeekly > 144) {
                System.err.println("Invalid Entry for Weekly Hours:");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate:");
            double taxRate = scan.nextDouble();

            if (taxRate <= 0 && taxRate > 10) {
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            int grossSlary = (hourRate * hoursWeekly * 4);
            double federalTax = 0.26 * grossSlary;
            double stateTax = taxRate * grossSlary;
            double totalTax = federalTax + stateTax;
            double netIncome = grossSlary - totalTax;

            System.out.println("Gross salary=" + grossSlary);
            System.out.println("Federal tax=" + federalTax);
            System.out.println("State tax=" + stateTax);
            System.out.println("Total tax" + totalTax);
            System.out.println("Net income" + netIncome);

            System.out.println("Would you like to continue?");
            String a = scan.next();
            if (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (a.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }
        scan.close();
    }
}
