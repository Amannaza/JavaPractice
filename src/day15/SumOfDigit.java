package day15;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        /*	3. write a program that can calculate the sum of all numbers between 1 to any given number
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();
        int result = 0;
        input.close();

        for (int i = 1; i <= number; i++) {
            result += i;

        }
        System.out.println(result);


    }
}
