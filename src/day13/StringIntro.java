package day13;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
      /*1.write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence*/

        String sentence = "Turkmenistan is the most beautiful country of Asia for me";

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);


        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------------");

        /*2. write a program that asks user to enter two strings, and print out the longest string
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first string:");
        String s1 = input.next();

        System.out.println("Please enter second string:");
        String s2 = input.next();
        input.close();

        if (s1.length() > s2.length()) {
            System.out.println(s1);
        } else if(s2.length() > s1.length()) {
            System.out.println(s2);
        }else {
            System.out.println("Two of them same number of character");
        }


    }
}
