package day24;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

       /* 8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
        Ex:
        arr = {10, 20, 30, 40};
        reverse(arr) ==> {40, 30, 20, 10}*/

       int[] arr = {10, 20, 30, 40};

       int[] reverse=reverseArray(arr);
        System.out.println(Arrays.toString(reverse));
    }


    public static int[] reverseArray(int[] arr) {
        int[] res = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[j++]=arr[i];
        }
        return res;
    }
}
