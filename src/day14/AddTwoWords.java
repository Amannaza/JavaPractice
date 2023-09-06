package day14;

import java.util.Scanner;

public class AddTwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String w1 = input.next();

        System.out.println("Enter second word:");
        String w2 = input.next();
        String result = "";

        input.close();

        if (w1.charAt(w1.length()-1) == w2.charAt(0)) {

             result = w1 + w2.substring(1);
        }else {
         result = w1 + w2;}

        System.out.println(result);


    }
}
