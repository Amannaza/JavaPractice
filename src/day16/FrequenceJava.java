package day16;

public class FrequenceJava {
    public static void main(String[] args) {
        String sentence = "JavaJavaJavaJavaJava";

        int frequence = 0;

        for (int i = 0; i <  sentence.length() - 3; i++) {  //make sure that index number include sentences.

            String eachSub = sentence.substring(i, i + 4);       //4 character

            System.out.println("str = " + eachSub);

            if (eachSub.equals("Java")) {

                frequence++;
            }
        }
        System.out.println(frequence);

    }
}
