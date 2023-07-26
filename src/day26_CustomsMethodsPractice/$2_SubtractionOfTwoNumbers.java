package day26_CustomsMethodsPractice;

public class $2_SubtractionOfTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(subtractionOfTwoNumbers(a,b));

        double x = 5.9;
        double y = 4.1;
        System.out.println(subtractionOfTwoNumbers(x,y));
    }

    public static int subtractionOfTwoNumbers (int num1, int num2){
        int result = num1-num2;
        return result;
    }

    public static double subtractionOfTwoNumbers (double num1, double num2){
        double result = num1-num2;
        return result;
    }

}
