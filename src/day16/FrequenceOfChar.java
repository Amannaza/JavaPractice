package day16;

import java.util.Scanner;

public class FrequenceOfChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
        System.out.println("Enter a char:");
        char ch=input.next().charAt(0);

        int frequence = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
    if (eachChar==ch) {

        frequence++;
    }
}
        input.close();
        System.out.println(frequence);
    }
}
