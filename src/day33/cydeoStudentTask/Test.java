package day33.cydeoStudentTask;

public class Test {

    public static void main(String[] args) {

        CydeoStudents student1 = new CydeoStudents("Aman", 27, 18, 9, 3, 'C');
        CydeoStudents student2 = new CydeoStudents("Yakup", 25, 20, 7, 2, 'B');
        student1.printProgrammingLanguage();
        student2.printProgrammingLanguage();

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();


    }
}
