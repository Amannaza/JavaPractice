package day27;

import java.util.Arrays;

public class UpperLowerEqual {

    public static void main(String[] args) {

        String str = "JAVA java";
        upperLowerEqual(str);

    }


    public static void upperLowerEqual(String str) {

        int upperCase = 0;
        int lowerCase = 0;

        for (char each : str.toCharArray()) {

            if (Character.isUpperCase(each)) {
                upperCase++;
            } else if (Character.isLowerCase(each)) {
                lowerCase++;
            }
        }
        boolean result = upperCase == lowerCase;

        System.out.println(result);
    }
}