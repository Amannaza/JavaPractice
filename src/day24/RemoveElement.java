package day24;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        /*10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
        Ex:
        array = {10, 20, 30, 40, 50, 60}
        index = 2
        removeElement(array, index) ==== {10, 20, 40, 50, 60}
*/
        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;

        int[] removed = removeElement(array, index);
        System.out.println(Arrays.toString(removed));

    }

    static public int[] removeElement(int[] arr, int index) {

        int[] result = new int[arr.length - 1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i == index) {
                continue;

            }
            result[j++] = arr[i];
        }

        return result;
    }
}
