package day17;

import java.util.Scanner;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        int count = 0;  //num1/num2

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }

        input.close();

        System.out.println("Division is = " + count + ",with a remainder of = " + num1);

    }
}
