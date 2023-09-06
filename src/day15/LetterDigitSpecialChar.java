package day15;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {

        String str = "aman 56%7&8)ds0gsdgdghyyjg9*";
        String digit = "";
        String capitalLetters = "";
        String smallLetters = "";
        String specialChar = "";


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '1' && c <= '9') {
                digit += c;
            } else if (c >= 'A' && c <= 'Z') {
                capitalLetters += c;
            } else if (c >= 'a' && c <= 'z') {
                smallLetters += c;
            } else {
                specialChar += c;
            }

        }


        System.out.println("Digits:" + digit);
        System.out.println("Capital Letters:" + capitalLetters);
        System.out.println("Small Letters:" + smallLetters);
        System.out.println("Special Character:" + specialChar);


    }
}
