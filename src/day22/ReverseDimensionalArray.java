package day22;

import java.util.Arrays;

public class ReverseDimensionalArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {8, 9, 10, 11, 12, 13};

        int[][] arr2D = new int[3][];

        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;

        int[][] result = new int[arr2D.length][];


        for (int i = 0; i < arr2D.length; i++) {

            int[] temp = new int[arr2D[i].length];// temporrary array variable to hold the elements

            for (int j = 0; j < arr2D[i].length; j++) {

                temp[(temp.length - 1) - j] = arr2D[i][j];// getting the last elements of each 1D array and assigning to the beginning indexes of temp array
            }
            result[(arr2D.length - 1) - i] = temp;
        }
        System.out.println(Arrays.deepToString(result));

        System.out.println("------------------------------------------------");

        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        int[][] reverse = new int[array.length][];

        for (int m = 0; m < array.length; m++) {
            int[] element = new int[array[m].length];
            for (int n = 0; n < array[m].length; n++) {
                element[(element.length - 1) - n] = array[m][n];
            }
            reverse[(element.length - 2) - m] = element;             // Why subtracted 2
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}
/*
1. Write a program that can reverse a two dimensional array (return new array)
        Ex:
        array = { {1,2,3}, {4,5,6}};


        output:
        reverse = { {6,5,4}, {3,2,1},};*/
