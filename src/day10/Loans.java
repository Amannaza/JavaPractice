package day10;

public class Loans {
    public static void main(String[] args) {
        /*Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.
             To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
              NOTE: MUST USE TERNARY.
*/

        int salary = 55_000;
        int credit_score = 600;

        String res = (salary < 60_000 && credit_score < 650) ? "Loan Approved" : "Loan Denied";
        System.out.println(res);


    }
}
