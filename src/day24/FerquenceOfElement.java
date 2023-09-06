package day24;

public class FerquenceOfElement {
    public static void main(String[] args) {

       /* 5. create method that accepts one integer array and one integer number and returns the frequency of the number

        Ex:
        int[] array ={1,1,1,1,1,2,2};

        frequency(array, 1) ==> 5*/
        int[] array = {1, 1, 1, 1, 1, 2, 2};
        int frekans = frequence(array, 1);
        System.out.println(frekans);
    }

    public static int frequence(int[] arr, int number) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                count++;
            }
        }

       /* for (int each : arr) {
            if (number == each) {
                count++;
            }
        }*/
        return count;
    }


}
