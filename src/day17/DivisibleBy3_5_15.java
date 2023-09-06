package day17;

import java.util.Scanner;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        String divisible3 = "";
        String divisible5 = "";
        String divisible15 = "";

        for (int i = 1; i <= num; i++) {

            if (i % 15 == 0) {
                divisible15 += i + " ";
            }
            if (i % 5 == 0) {
                divisible5 += i + " ";
            }
            if (i % 3 == 0) {
                divisible3 += i + " ";
            }


        }

        System.out.println("Numbers divisible by Fifteen:" + divisible15);
        System.out.println("Numbers divisible by Five:   " + divisible5);
        System.out.println("Numbers divisible by Three:  " + divisible3);

        input.close();
    }
}
