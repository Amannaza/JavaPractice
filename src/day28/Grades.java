package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class Grades {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>();
        ArrayList<Integer> gradeOfB = new ArrayList<>();
        ArrayList<Integer> gradeOfC = new ArrayList<>();
        ArrayList<Integer> gradeOfD = new ArrayList<>();
        ArrayList<Integer> gradeOfE = new ArrayList<>();
        ArrayList<Integer> gradeOfF = new ArrayList<>();

        for (Integer each : scores) {

            if (each >= 90) {
                gradeOfA.add(each);
            } else if (each >= 80) {
                gradeOfB.add(each);
            } else if (each >= 70) {
                gradeOfC.add(each);
            } else if (each >= 60) {
                gradeOfD.add(each);
            } else if (each >= 50) {
                gradeOfE.add(each);
            } else {
                gradeOfF.add(each);
            }

        }

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfE = " + gradeOfE);
        System.out.println("gradeOfF = " + gradeOfF);

    }

}
/*
8. Given the following arraylists:
        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F*/
