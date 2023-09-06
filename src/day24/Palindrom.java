package day24;

public class Palindrom {
    public static void main(String[] args) {

      /*  4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

        Ex:
        str = "Level"

        isPalindrome(str) ===> true
        */
     String   str = "Level";

     boolean res=isPalindrom(str);
        System.out.println("Palindrome="+res);



    }

    public static boolean isPalindrom(String str){

return reverse.reverseWord(str).equalsIgnoreCase(str);
    }





}
