package day16;

import java.util.Scanner;

public class MultiplicationTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        int result = 0;

        if (num1<0||num2<0){
            System.out.println("Invalid");
        }else {
            for (int i = 0; i < num1; i++) {

                result += num2;

            }
            input.close();
            System.out.println("Multiplication result=" + result);
        }
    }
}
