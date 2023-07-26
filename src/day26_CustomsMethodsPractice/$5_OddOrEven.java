package day26_CustomsMethodsPractice;

public class $5_OddOrEven {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(6));

        System.out.println("---------------------");

        System.out.println(isOddNumber(5));
        System.out.println(isOddNumber(6));
    }

    public static boolean isEvenNumber (int number) {
        boolean result = true;
        if (number % 2 == 0) {
            System.out.println("is " + number + " even number?");
            return result;
        } else {
            System.out.println("is " + number + " even number?");
            return !result;
        }
    }

    public static boolean isOddNumber (int number) {
        boolean result = true;
        if (number % 2 != 0) {
            System.out.println("is " + number + " odd number?");
            return result;
        } else {
            System.out.println("is " + number + " odd number?");
            return !result;
        }
    }


}
/*
2.8 Create a method that can check if an integer is even number
2.9 Create a method that can check if an integer is odd number
 */