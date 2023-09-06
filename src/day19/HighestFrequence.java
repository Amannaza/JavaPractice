package day19;

public class HighestFrequence {
    public static void main(String[] args) {

        String str = "AABBCCCCCCDDEGGFJJJJJJJJJJJD";
        int f = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;



            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (each == ch) {
                    count++;
                }
            }
            if (count > f) {
                f=0;
                result="";

                f+=count;
                result+=(""+ch);
            }
        }
        System.out.println("Most repeated char is "+result+" and frequence="+f);

    }
}
