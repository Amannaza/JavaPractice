package day22;import java.util.Arrays;public class ReverOf2DCharArray {    public static void main(String[] args) {        char[] ch1 = {'A', 'B', 'C'};        char[] ch2 = {'D', 'E', 'F', 'G'};        char[] ch3 = {'H', 'I'};        char[][] char2D = new char[3][];        char2D[0] = ch1;        char2D[1] = ch2;        char2D[2] = ch3;        System.out.println(Arrays.deepToString(char2D));        System.out.println("---------------------------------------------------");//Get the reverse of each elelemt and array!        char[][] reverse = new char[char2D.length][];        int k = 0;        for (int i = char2D.length - 1; i >= 0; i--) {            //System.out.println(Arrays.toString(char2D[i]));            char[] eachArrayChar = new char[char2D[i].length];            int h = 0;            for (int j = char2D[i].length - 1; j >= 0; j--) {                eachArrayChar[h++] = char2D[i][j];                //System.out.print(char2D[i][j] + " ");            }            // System.out.println();            System.out.println(Arrays.toString(eachArrayChar));            reverse[k++] = eachArrayChar;        }        System.out.println(Arrays.deepToString(reverse));    }}