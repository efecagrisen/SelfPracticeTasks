package day26_CustomsMethodsPractice;

public class $7_MinNumber {
    
        public static void main(String[] args) {
            int num1 = 10,
                num2 = 20;

            System.out.println(minNumber(num1,num2));

        }

        public static int minNumber (int num1, int num2){
            return (num1<num2)? num1 : num2;
        }


    }
/*
2.12 Create a method that can return the minimum number between two integers
2.13 Create a method that can return the minimum number between two decimal numbers
 */
