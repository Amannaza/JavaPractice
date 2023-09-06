package day18;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabccdf";
        String result = "";

        String s = "AABBBCDERRTTTKKLL";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                char each = s.charAt(j);

                if (ch == each) {
                    count++;
                }
                }
                if (count != 1) {
                    continue;
                }
                result += ch;

            }
            System.out.println(result);


    }
}