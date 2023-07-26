package day24_ReturnMethods;

import java.util.Arrays;
import java.util.Scanner;

public class $7_Merge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of arr1");
        int length1 = scan.nextInt();
        int[] arr1 = new int[length1];
        for (int i = 0; i < arr1.length; i++) {
        arr1[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("enter length of arr2");
        int length2 = scan.nextInt();
        int[] arr2 = new int[length2];
        for (int j = 0; j < arr2.length; j++) {
        arr1[j]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(merge(arr1,arr2)));

        
    }
    
    public static int[] merge(int[] arr1,int[]arr2){
        
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1 [i];

            for (int j = 0; j < arr2.length; j++) {
                merged[j] = arr2[j];
            }
        }

        return merged;

    }
    
    
    
    
}
/*
7. Create a method named merge that passes two integer array parameters, 
the method can merge two integer arrays and return the new array

    Ex:
        arr1 = {1,2,3}
        arr2 = {4,5,6}

        merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */
