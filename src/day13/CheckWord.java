package day13;

import java.util.Scanner;

public class CheckWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
*/
        System.out.println("Enter first word:");
        String w1 = input.next();

        System.out.println("Enter second word:");
        String w2 = input.next();

        System.out.println("Enter third word:");
        String w3 = input.next();

        input.close();

    if (w1.length()==w2.length()&&w2.length()==w3.length()&&w1.length()==w3.length()){
        System.out.println("All words are same length");
    } else if (w1.length()==w2.length()||w2.length()==w3.length()||w1.length()==w3.length()) {
        System.out.println("Not Same nor Different lengths");
    }else {
        System.out.println("All different length");
    }


    }
}
