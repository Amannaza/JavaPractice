package day23;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

       /* 17. create a method that can check if two strings are anagram
        ex:
        anagram("silent", "listen")


        output:
        silent and listen are anagram*/

        anagramController("listen","silent");

    }


    public static void anagramController(String str1, String str2) {

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if (Arrays.equals(s1,s2)){
            System.out.println(str1+" and "+str2+" are anagram");
        }else {
            System.out.println("Not anagram");
        }


    }


}
 /*17. create a method that can check if two strings are anagram
         ex:
         anagram("silent", "listen")

         output:
         silent and listen are anagram
*/