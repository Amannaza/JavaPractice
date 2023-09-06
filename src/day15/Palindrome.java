package day15;

public class Palindrome {
    public static void main(String[] args) {

        String s = "rac  ecar";
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            result+= s.charAt(i);
        }
        boolean isPalindrome = s.equalsIgnoreCase(result);

        System.out.println("Is it palindrome:"+isPalindrome);


    }/*
	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level
				output:
					true
				input:
					Anna
				output:
					true*/
}
