package day27;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] swaped = swap(array, 2, 9);
        System.out.println(Arrays.toString(swaped));
    }

    //swap two element of array according given index number,return new array
    public static int[] swap(int[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        int n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }


    //swap two element of array according given index number,return new array
    public static double[] swap(double[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        double n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }


    //swap two element of array according given index number,return new array
    public static char[] swap(char[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        char n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }


    //swap two element of array according given index number,return new array
    public static String[] swap(String[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        String n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }



}
/*
2. Swap Task:
        2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
        Ex:
        arr = {10, 20, 30, 40, 50};

        swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

        2.2 Create the same function for double array, char array and string array
*/
