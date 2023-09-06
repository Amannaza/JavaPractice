package day09;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 54_000;
        double tax_rate = 0;
        boolean isMarried = true;

        if (salary >= 130_000) {
            tax_rate = 0.35;
        } else if (salary >= 100_000 ) {
            tax_rate = 0.30;
        } else if (salary >= 80_000 ) {
            tax_rate = 0.25;
        } else if (salary < 80_000) {
            tax_rate = 0.20;
        }
        if (isMarried ) {
            tax_rate -= 0.05;
        }
        double salaryAfterTax = salary - (salary * tax_rate);
        System.out.println("Salary After Tax = " + salaryAfterTax);

    }
}
