package day24;

public class FrequenceOfWorld {
    public static void main(String[] args) {
       /* 1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
        Ex:
        sentence = "Java java java python python"
        word = "java";
        frequencyOfWord(sentence, word) ==>  3*/

        String sentence = "Java java java python python",
                word = "java";

        int frequence = frequencyOfWord(sentence.toLowerCase(), word);

        System.out.println(frequence);

    }

    public static int frequencyOfWord(String sentence, String world) {

        int count = 0;

        /*while (sentence.contains(world)) {
            sentence = sentence.replaceFirst(world, "");
            count++;
        }*/
        for (int i = 0; i <sentence.length()-4 ; i++) {

            if (sentence.substring(i,i+4).equals(world)){
                count++;
            }
        }
        return count;
    }


}
