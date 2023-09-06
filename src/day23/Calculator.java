package day23;

public class Calculator {
    public static void main(String[] args) {


        calculator(54,32,'*');


    }




//	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculator(int num1,double num2,char mathOparetor){

        double result=0;

        if (mathOparetor=='+'){
            result=num1+num2;
        } else if (mathOparetor=='-') {
            result=num1-num2;
        }else if (mathOparetor=='*') {
            result=num1*num2;
        }else if (mathOparetor=='/') {
            result=num1/num2;
        }else if (mathOparetor=='%') {
            result=num1%num2;
        }else {
            System.out.println("Invalid Math Operator");
        }
        System.out.println("result = " + result);
    }

}
