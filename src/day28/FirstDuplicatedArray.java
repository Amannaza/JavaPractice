package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedArray {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));

        Integer firstDublicated = 0;

        for (Integer each : list) {
            int frequence = 0;

            for (Integer element : list) {
                if (each == element) {
                    frequence++;
                }
            }

            if (frequence > 1) {
                firstDublicated = each;
                break;

            }
        }
        System.out.println("firstDublicated = " + firstDublicated);
    }

}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
        Ex:
        list = [1,2,2,3,4,4,5,6,7,7];
        output:
        2*/
