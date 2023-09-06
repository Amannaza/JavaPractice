package day10;

public class GradeLevel {
    public static void main(String[] args) {
/*Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School*/

        byte n = 3;
        String level = "";

        if (n >= 1 && n <= 19) {
            if (n >= 1 && n <= 5) {
                level = "Elementary School";
            } else if (n >= 6 && n <= 8) {
                level = "Middle School";
            } else if (n >= 9 && n <= 12) {
                level = "High School";
            } else if (n >= 13 && n <= 16) {
                level = "College";
            } else {
                level = "Grad School";
            }
        } else {
            level = "İnvalid";
        }
        System.out.println("level = " + level);

        System.out.println("---------------------------------------------------");

        String result = (n >= 1 && n <= 19) ? (n >= 1 && n <= 5) ? "Elementary School" : (n >= 6 && n <= 8) ? "Middle School" : (n >= 9 && n <= 12) ? "High School" : (n >= 13 && n <= 16) ? "College" : "Grad School  : " :

        "İnvalid ";

        System.out.println(result);

    }
}
