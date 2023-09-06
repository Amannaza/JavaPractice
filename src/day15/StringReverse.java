package day15;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String res = "";

        for (int i = str.length() - 1; 0 <= i; i--) {

            res +=str.charAt(i);
        }

        System.out.println(res);
    }
}
