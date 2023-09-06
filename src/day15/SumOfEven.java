package day15;

public class SumOfEven {
    public static void main(String[] args) {

        /*1. Write a program that can return the sum of even numbers between 1 to 100 */

        int result=0;

        for (int i = 1; i <101 ; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
            System.out.println(result);





    }
}
