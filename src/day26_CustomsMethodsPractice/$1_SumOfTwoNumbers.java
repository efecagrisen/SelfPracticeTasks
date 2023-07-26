package day26_CustomsMethodsPractice;

public class $1_SumOfTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(sumOfTwoNumbers(a,b));

        double x = 5.9;
        double y = 4.1;
        System.out.println(sumOfTwoNumbers(x,y));
    }
    
    public static int sumOfTwoNumbers (int num1, int num2){
        int result = num1+num2;
        return result;
    }

    public static double sumOfTwoNumbers (double num1, double num2){
        double result = num1+num2;
        return result;
    }
    
    
}
/*
2.1 Create a method that can return the sum of two integers
2.2 Create a method that can return the sum of two decimal numbers
 */
