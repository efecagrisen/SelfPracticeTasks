package day26_CustomsMethodsPractice;

public class $9_cubeOfNumber {
    public static void main(String[] args) {
        int num1 = 4;
        System.out.println(cubeOfNumber(num1));
        double num2 = 4.1;
        System.out.println(cubeOfNumber(num2));

    }

    public static int cubeOfNumber (int number){
        return number*number*number;
    }
    public static double cubeOfNumber (double number){
        return number*number*number;
    }
    
    
}
/*
2.16 Create a method that can return the cube of an integer
2.17 Create a method that can return the cube of a double
 */