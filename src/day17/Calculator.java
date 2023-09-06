package day17;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("Enter mathematic oparetor:");
        char mathOparetor = input.next().charAt(0);

        int result = 0;

        while (!(mathOparetor == '+' || mathOparetor == '-' || mathOparetor == '/' || mathOparetor == '*')) {

            System.out.println("Invalid,please re-enter:");

            System.out.println("Enter mathematic oparetor:");
            mathOparetor = input.next().charAt(0);

        }

        if (mathOparetor == '+' || mathOparetor == '-' || mathOparetor == '/' || mathOparetor == '*') {

            result = (mathOparetor == '+') ? num1 + num2 : (mathOparetor == '-') ? num1 - num2 : (mathOparetor == '/') ? num1 / num2
                    : num1 * num2;
        }

        System.out.println(result);
        input.close();

    }
}/* 3. write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)*/
