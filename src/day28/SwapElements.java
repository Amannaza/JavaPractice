package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));

        System.out.println(list);

        int firstIndex = list.get(0);

        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, firstIndex);

        System.out.println(list);

    }

}
/*
2. write a program that can swap the first and last elements of an integer arraylist
        ex:
        list = [1,2,3,4,5];
        output: [5,2,3,4,1];*/
