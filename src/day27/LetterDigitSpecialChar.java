package day27;

public class LetterDigitSpecialChar {

    public static void main(String[] args) {
        String str="aksjalf230582!@#$%";
        retrive(str);
    }



    public static void retrive(String str) {
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (char each : str.toCharArray()) {


            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                specialChars += each;
            }
        }
            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);
            System.out.println("specialChars = " + specialChars);


    }

}