package shortVideosPractice;

import java.util.Scanner;

public class Scannerİnt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user to enter integer number
        System.out.println("Enter integer number:");
        int num1 = input.nextInt();

//Ask the user to enter decimal number
        System.out.println("Enter decimal number:");
        double num2 = input.nextDouble();

        //Ask the user to enter String
        System.out.println("Enter String :");
        String string = input.next();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("string = " + string);

    }
}
