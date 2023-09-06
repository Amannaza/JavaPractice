package day14;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number:");
        String accountNumber = input.next();
        input.close();

        int lengthNumber = accountNumber.length();
        int firstChar = accountNumber.charAt(0);
        String result = "";

        if (firstChar == '2') {
            if (lengthNumber == 7) {
                result = "Valid";
            }
        } else if (firstChar == '5') {
            if (lengthNumber == 10) {
                result = "Valid";
            }
        } else {
            result ="Invalid account number";
        } System.out.println(result);


    }/*Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”*/
}
