package day23;

public class OddOrEvenNumbers {
    public static void main(String[] args) {

        oddNumbers(1, 41);

        System.out.println();
        System.out.println("----------------------");

        evenNumbers(34, 77);
    }


    //	1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void oddNumbers(int startingNumber, int finishingNumber) {
        for (int i = startingNumber; i < finishingNumber; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


    //	2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void evenNumbers(int startingNumber, int finishingNumber) {
        for (int i = startingNumber; i < finishingNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}