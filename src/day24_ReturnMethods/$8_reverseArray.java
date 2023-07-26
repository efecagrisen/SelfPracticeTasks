package day24_ReturnMethods;

import java.util.Arrays;
import java.util.Scanner;

public class $8_reverseArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr1 = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(reverseArray(arr1)));

    }

    public static int[] reverseArray (int[] array){

        int[] arr2 = new int[array.length];
        int index = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            arr2[index] = array[i];
            index++;
        }
        return arr2;
    }

}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

    Ex:
        arr = {10, 20, 30, 40};

        reverse(arr) ==> {40, 30, 20, 10}
 */
