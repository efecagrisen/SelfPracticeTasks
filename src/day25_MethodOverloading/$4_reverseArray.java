package day25_MethodOverloading;

import java.util.Arrays;
import java.util.Scanner;

public class $4_reverseArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the integer array: ");
        int length = scan.nextInt();
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(reverseArray(intArray)));

        System.out.println("Enter the length of the double array: ");
        length = scan.nextInt();
        double[] doubleArray = new double[length];
        for (int i = 0; i < length; i++) {
            doubleArray[i] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(reverseArray(doubleArray)));
       
        System.out.println("Enter the length of the char array: ");
        length = scan.nextInt();
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = scan.next().charAt(0);
        }
        System.out.println(Arrays.toString(reverseArray(charArray)));

        System.out.println("Enter the length of the String array: ");
        length = scan.nextInt();
        String[] stringArray = new String[length];
        for (int i = 0; i < length; i++) {
            stringArray[i] = scan.next();
        }
        System.out.println(Arrays.toString(reverseArray(stringArray)));
         
    }

    public static int[] reverseArray (int[] array){

        int index = 0;
        int[] reversed = new int[array.length];
        for (int i = array.length-1; i >=0 ; i--) {
            reversed[index] = array[i];
            index++;
        }
        return reversed;
    }

    public static double[] reverseArray (double[] array){

        int index = 0;
        double[] reversed = new double[array.length];
        for (int i = array.length-1; i >=0 ; i--) {
            reversed[index] = array[i];
            index++;
        }
        return reversed;
    }

    public static char[] reverseArray (char[] array){

        int index = 0;
        char[] reversed = new char[array.length];
        for (int i = array.length-1; i >=0 ; i--) {
            reversed[index] = array[i];
            index++;
        }
        return reversed;
    }

    public static String[] reverseArray (String[] array){

        int index = 0;
        String[] reversed = new String[array.length];
        for (int i = array.length-1; i >=0 ; i--) {
            reversed[index] = array[i];
            index++;
        }
        return reversed;
    }
    
}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */
