package day14;

import java.util.Scanner;

public class WitoutX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = input.next();
        input.close();


        if (word.charAt(0) == 'x') {

            word=word.replace("x","");

            //word = word.substring(1);

        }
        System.out.println(word);
    }
}