package day24;

public class Contains {
    public static void main(String[] args) {

       /* 9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false
        Ex:
        arr = {1,2,3,4,5,6,7};
        num = 10;
        contains(arr, num) ===> false*/

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int num = 10;
        boolean isContains = contain(arr, num);
        System.out.println("Array contains " + num + " number :" + isContains);
    }


    public static boolean contain(int[] arr, int number) {
        boolean result = false;

        for (int each : arr) {


            if (each == number) {
                result = true;
            }
        }

        return result;
    }


}
