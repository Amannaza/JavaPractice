package shortVideosPractice;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /* Given a number(byte) grade level determine and print which school type someone is in.
    grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School*/

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isElementary = num >= 1 && 5 >= num;
        boolean isMiddle = num >= 6 && 8 >= num;
        boolean isHigh = num >= 9 && 12 >= num;
        boolean isCollege = num >= 13 && 16 >= num;
        boolean isGrad = num == 17 || num == 18;
        if (isElementary) {
            System.out.println("ELEMENTARY SCHOOL");
        }
        if (isMiddle) {
            System.out.println("Middle School");
        }
        if (isHigh) {
            System.out.println("High School");
        }
        if (isCollege) {
            System.out.println("Colllege");
        }
        if (isGrad) {
            System.out.println("Grad School");
        }

    }


}
