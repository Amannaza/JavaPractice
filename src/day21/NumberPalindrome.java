package day21;

public class NumberPalindrome {
    public static void main(String[] args) {

        String[] str = {"anna", "level", "java"};

        int count = 0;


        for (String each : str) {
            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)) {
                count++;
            }

        }
        System.out.println("Number of palindrome=" + count);


    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
        {"anna", "level", "Java"};
        output:
        2
*/
