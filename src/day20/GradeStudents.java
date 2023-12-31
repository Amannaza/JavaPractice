package day20;

public class GradeStudents {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 60, 80};
        char[] grades = new char[names.length];

        String result = "";

        for (int i = 0; i < scores.length; i++) {

            String nameStudent = names[i];
            int scoreStudent = scores[i];

            if (scoreStudent >= 90) {
                grades[i] = 'A';
            } else if (scoreStudent >= 80) {
                grades[i] = 'B';
            } else if (scoreStudent >= 70) {
                grades[i] = 'C';
            } else {
                grades[i] = 'F';
            }

            result += nameStudent + "\'s score is  " + grades[i] + "\n";
        }

        System.out.println(result);

    }
}
/*4. given the following arrays:
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
;
        1. write a program that can store the grades of the students in the array named grades
        2. print the grade report of each students in separate lines
        Ex:
        Anna's score is 90, and grade is A*/
