package day26_CustomsMethodsPractice;

public class $8_SquareOfNumber {
    public static void main(String[] args) {
        int num1 = 8;
        System.out.println(squareOfNumber(num1));
        double num2 = 4.4;
        System.out.println(squareOfNumber(num2));

    }

    public static int squareOfNumber (int number){
        return number*number;
    }
    public static double squareOfNumber (double number){
        return number*number;
    }
}
/*
2.14 Create a method that can return the square of an integer
        Ex: square(2) ==> 4
2.15 Create a method that can return the square of a double
*/