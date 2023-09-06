package day23;

public class GradeOfStudent {


    //	5. create a method that can calculate the grade of the student based on the score

public static void gradeCalculator(int grade){

 String result= (grade>=90)?"Excellent":(grade>=80)?"Good":(grade>=60)?"Average":"Qualified";
    System.out.println(result);
}

    public static void main(String[] args) {
        gradeCalculator(90);
    }
}
