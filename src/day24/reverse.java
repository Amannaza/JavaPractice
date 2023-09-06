package day24;

public class reverse {
    public static void main(String[] args) {

        /*3. create a method named reverse that passes one string parameter, the method can return the reversed string

        Ex:
        str = "Java";

        reverse(str) ==> avaJ  */
        String str = "Java";

        str=reverseWord(str);
        System.out.println(str);

    }


    public static String reverseWord(String word) {

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return reverse;
    }


}
