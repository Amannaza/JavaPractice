package day23;

public class EachCharOfString {
    public static void main(String[] args) {

        eachCharString("Amannazar");


    }



    //	13. create a method named printEachChar that can print each characters of a string
    public static void eachCharString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+"\t");
        }
    }
}
