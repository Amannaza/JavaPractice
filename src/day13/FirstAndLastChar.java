package day13;

import java.util.Scanner;

public class FirstAndLastChar {
    public static void main(String[] args) {
       /*3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same*/

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word for see first and last char is same or not?!");
        String word = input.next();
        input.close();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if (firstChar == lastChar) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

    }
}
