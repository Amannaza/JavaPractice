package day18;

import java.util.Scanner;

public class CalculationTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;
        while (true) {
            System.out.println("Enter first number:");
            int num1 = input.nextInt();

            System.out.println("Enter math Oparetor:");
            char mathOparetor = input.next().charAt(0);

            while (!(mathOparetor == '*' || mathOparetor == '/' || mathOparetor == '+' || mathOparetor == '-')) {
                System.out.println("Please enter valid math oparetor(*,/,+,-):");
                mathOparetor = input.next().charAt(0);
            }

            System.out.println("Enter second number:");
            int num2 = input.nextInt();

            if (mathOparetor == '*') {
                result = num1 * num2;
            } else if (mathOparetor == '/') {
                result = num1 / num2;
            } else if (mathOparetor == '+') {
                result = num1 + num2;
            } else {
                result = num1 - num2;
            }
            System.out.println("Result=" + result);

            System.out.println("Do you want to continue?");
            String ans = input.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("Invalid.Do you want to continue?");
                ans = input.next().toLowerCase();
            }

            if (ans.equals("no")) {
                System.out.println("Thank you for using Cydeo calculator!");
                break;
            }
        }
        input.close();

    }
}
