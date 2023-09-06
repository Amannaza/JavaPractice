package day28;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5));

        Integer max = numbers.get(0);

        for (Integer each : numbers) {

            if (each > max) {
                max = each;
            }
        }

        System.out.println("max = " + max);


    }

}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
        Ex:
        list = [1,2,3,4,5];
        output:
        5*/
