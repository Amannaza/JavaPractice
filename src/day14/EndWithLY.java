package day14;

import java.util.Scanner;

public class EndWithLY {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = input.next();
        input.close();

        String lastTwoChars = word.substring(word.length() - 2);

        if (lastTwoChars.toLowerCase().equals("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }


    }
}
