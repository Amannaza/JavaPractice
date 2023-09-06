package day14;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first words:");
        String w1 = input.next();

        System.out.println("Enter second words:");
        String w2 = input.next();

        input.close();

        String result = w1.substring(1) + w2.substring(1);
        System.out.println(result);


    }


}
