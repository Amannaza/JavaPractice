package day14;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        input.close();

        char firrstChar = word.charAt(0);

        String result = "";

        if (firrstChar >= 48 && firrstChar <= 57) //        if (firrstChar>= '0' && firrstChar <= '9')
        {
            result = "first character is digit";
        } else if (firrstChar >= 65 && firrstChar <= 90)      //(firrstChar >= 'A' && firrstChar <= 'Z')
        {
            result = "first character is uppercase letter";
        } else if (firrstChar >= 97 && firrstChar <= 122)      //(firrstChar >= 'a' && firrstChar <= 'z')
        {
            result = "first character is lowercase character";
        } else {
            result = "special character";

        }
        System.out.println(result);


    }/* Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
*/
}
