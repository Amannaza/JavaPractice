package day20;

public class Classmates_Reverse {
    public static void main(String[] args) {

        String[] classmates = {"Maya", "Ahmet", "Erhan"};


        for (int i = 0; i < classmates.length ; i++) {

            String result = classmates[i];

            for (int j = result.length() - 1; j >= 0; j--) {

                char reverse = result.charAt(j);
                System.out.print(reverse);
            }
            System.out.println();
        }


    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
                    ex:
        arr = {java, python, c#}

        output:
        avaJ
        nohtyp
        #c*/
