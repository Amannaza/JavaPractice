package day33.cydeoStudentTask;

public class CydeoStudents {
    public String name;
    public int age,id,batchNumber,groupNumber;

    public char grade;

    public static String schoolName="CydeoSchool",programmingLanguage="Java";

    public CydeoStudents(String name, int age, int id, int batchNumber, int groupNumber,char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade=grade;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is just attended class");
    }
    public void printSchoolName(){
        System.out.println(schoolName);
    }
    public void printProgrammingLanguage(){
        System.out.println(programmingLanguage);
    }


    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", school name=" + schoolName +
                ", grade=" + grade +
                '}';
    }



}
/*1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
*/