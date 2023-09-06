package day25;

import java.util.Arrays;

public class MergeOfTwoArrays {

    public static void main(String[] args) {

        int[] arrInt1 = {2, 7, 9};
        int[] arrInt2 = {3, 6, 1};
        int[]mergedIntArray=mergeIntArrays(arrInt1,arrInt2);
        System.out.println(Arrays.toString(mergedIntArray));


        double[] arrD1 = {7.34, 4.56, 2.78};
        double[] arrD2 = {3.5, 6.3, 1.9};
        double[]mergedDoubleArray=mergeDoubleArrays(arrD1,arrD2);
        System.out.println(Arrays.toString(mergedDoubleArray));


        char[] arrch1 = {'a', 'b', 'c', 'd', 'e'};
        char[] arrch2 = {'e', 'b', 'c', 'a', 'd'};
        char[]mergedCharArray=mergeCharArrays(arrch1,arrch2);
        System.out.println(Arrays.toString(mergedCharArray));


        String[] arrS1 = {"Ani", "Sam", "Joe"};
        String[] arrS2 = {"Cricket","Basketball","Football","Badminton","Tennis"};
        String[]mergedStringArray=mergeStringArrays(arrS1,arrS2);
        System.out.println(Arrays.toString(mergedStringArray));

    }


    //         1. create a method that can merge two integer arrays.
    public static int[] mergeIntArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //       2. create a method that can merge two double arrays.

    public static double[] mergeDoubleArrays(double[] arr1, double[] arr2) {

        double[] result = new double[arr1.length + arr2.length];
        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //          3. create a method that can merge two char arrays.

    public static char[] mergeCharArrays(char[] arr1, char[] arr2) {

        char[] result = new char[arr1.length + arr2.length];
        int i = 0;

        for (char each : arr1) {
            result[i++] = each;
        }

        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }
    //      4. create a method that can merge two String arrays.  	*/

    public static String[] mergeStringArrays(String[] arr1, String[] arr2) {

        String[] result = new String[arr1.length + arr2.length];
        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }
        return result;

    }


}




