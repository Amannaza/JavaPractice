package day15;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number you want to take factory:");
        int num = input.nextInt();
        int result = 1;

        input.close();

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial Of Number "+num+" is equal to="+result);

    }/*Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
*/
}
