package day23;

public class RegularFormat {

    public static void main(String[] args) {


    fullName("cYdEo", "SCHOOL");


    }

    /*16.  write a method that can print out the full name of a person in regular format
                ex:
                   fullName("cYdEo", "SCHOOL");

                    output:
                        "Cydeo School"*/

    public static void fullName(String firstName,String lastName){
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("Fullname = " + firstName+" "+lastName);
    }


}
