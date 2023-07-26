package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];


        while (true) {
            int count =0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter a number");
                int number = scan.nextInt();
                count++;
                array[i]+= number;
            }

            if(count==10){
                break;
            }

        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[9]);
        
    }//main
}
/*
Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number

 */