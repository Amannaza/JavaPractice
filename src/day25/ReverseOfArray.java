package day25;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));


        double[] arrd = {12.23,20.45,67.89,100.12,256.34};
        double[] reversedd = reverse(arrd);
        System.out.println(Arrays.toString(reversedd));


        char[] ch = {'a','b','c','d','e'};
        char[] reversedch = reverse(ch);
        System.out.println(Arrays.toString(reversedch));


        String[] arrStr = {"maya","Aman","Zohre","Gahryman","Ayna"};
        String[] reversedS = reverse(arrStr);
        System.out.println(Arrays.toString(reversedS));

    }


    //            1. Create a method that can reverse an integer array
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //  2. Create a method that can reverse a double array
    public static double[] reverse(double[] arr) {
        double[] result = new double[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }


    //        3. Create a method that can reverse a char array
    public static char[] reverse(char[] arr) {
        char[] result = new char[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //        4. Create a method that can reverse a String array
    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

}

      