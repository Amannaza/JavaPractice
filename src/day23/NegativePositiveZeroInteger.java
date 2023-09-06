package day23;

public class NegativePositiveZeroInteger {

    public static void main(String[] args) {


        valueNumber(-84758);


    }


    //	12. create a method that can if the given integer is positive, negative or zero
    public static void valueNumber(int number) {
        if (number > 0) {
            System.out.println("number is positive = " + number);
        } else if (number == 0) {
            System.out.println("number is zero = " + number);
        } else {
            System.out.println("number is negative = " + number);
        }
    }


}
