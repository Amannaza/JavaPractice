package day15;

public class SumOfOdd {
    public static void main(String[] args) {

        /*	2. Write a program that can return the sum of odd numbers between 1 to 100
         */

        int result=0;

        for (int i = 1; i <101 ; i++) {
            if (i % 2 != 0) {
                result += i;
            }else {

            }
        }
        System.out.println(result);

    }
}
