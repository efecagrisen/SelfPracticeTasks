package day26_CustomsMethodsPractice;

public class $6_MaxNumber {
    public static void main(String[] args) {
        int num1 = 10,
            num2 = 20;

        System.out.println(maxNumber(num1,num2));

    }

    public static int maxNumber (int num1, int num2){
        return (num1>num2)? num1 : num2;
    }


}
/*
2.10 Create a method that can return the maximum number between two integers
2.11 Create a method that can return the maximum number between two decimal numbers
 */
