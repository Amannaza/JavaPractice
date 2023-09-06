package day17;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 0;

        while (true) {

            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number < 0) {
                break;
            }

            result += number;
        }
        System.out.println(result);
        input.close();

    }/*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

*/
}
