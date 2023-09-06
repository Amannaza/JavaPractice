package day13;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        /*6. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 letter word:");
        String word = input.next();
        input.close();

        if (word.length() < 3) {
            System.out.println("Word is too short");
        } else if (word.length() > 3) {
            System.out.println("Word is too long");

        } else {
            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");
            }

        }


    }
}
