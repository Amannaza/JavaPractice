package day21;

public class JavaAndPython {
    public static void main(String[] args) {

String[] strr={"java","Java","Python","java","Python","Python","Python","java","java"};

int countJava=0,countPython=0;

        for (String eachWord : strr) {

            if (eachWord.equalsIgnoreCase("java")){
                countJava++;
            } else if (eachWord.equalsIgnoreCase("python")){
            countPython++;
        }
        }
        System.out.println("Python:"+countPython+" and Java:"+countJava);



    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
        (similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)*/
