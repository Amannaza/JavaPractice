package day23;

public class printEachElementArray {
    public static void main(String[] args) {


//	14. create a method named printEachElement that can print each elements of an integer array

        int[] arr = {1, 2, 6, 3, 7, 5, 3};
        printEachElementArray(arr);


    }


    public static void printEachElementArray(int[] arr) {

        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}


