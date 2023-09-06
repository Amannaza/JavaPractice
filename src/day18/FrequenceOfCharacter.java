package day18;

import java.util.Scanner;

public class FrequenceOfCharacter {
    public static void main(String[] args) {

        String word = "AAABCCCDDDEEEEEEFFF";

        String result = "";


        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);

                if (ch == each) {
                    count++;

                }
            }
            if (result.contains(ch + "")) {
                continue;
            }
            result += ch;
            result += count;
        }

        System.out.println(result);
    }
}
