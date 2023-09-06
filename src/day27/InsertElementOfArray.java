package day27;

import java.util.Arrays;

public class InsertElementOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] arrNew = insert(arr, 4, 5000);

        System.out.println(Arrays.toString(arrNew));


    }

    //insert index of array with newElement,return new array
    public static int[] insert(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        int[] result = new int[array.length + 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            result[j++]= array[i] ;

            if (i == index) {
                result[j++] = newElement;
            }
        }
        return result;
    }


    //insert index of array with newElement,return new array
    public static double[] insert(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        double[]result=new double[array.length+1];
        int j=0;

        for (int i = 0; i < array.length; i++) {
            result[j++]=array[i];
            if (i==index){
                result[j++]=newElement;
            }
        }
        return result;
    }


    //insert index of array with newElement,return new array
    public static char[] insert(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        char[]result=new char[array.length+1];
        int j=0;

        for (int i = 0; i < array.length; i++) {
            result[j++]=array[i];
            if (i==index){
                result[j++]=newElement;
            }
        }
        return result;
    }


    //insert index of array with newElement,return new array
    public static String[] insert(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        String[]result=new String[array.length+1];
        int j=0;

        for (int i = 0; i < array.length; i++) {
            result[j++]=array[i];
            if (i==index){
                result[j++]=newElement;
            }
        }
        return result;
    }


}
