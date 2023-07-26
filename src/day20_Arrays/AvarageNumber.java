package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */
public class AvarageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("How many numbers you want to enter?");
        int numbers = scan.nextInt();

        int[] array = new int[numbers];

        while(true) {
            int count = 0;
            for (int i = 0; i < numbers; i++) {
                System.out.println("Enter a number");
                int num = scan.nextInt();
                array[i] = num;
                count++;
            }
            if (count==numbers){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        int average = 0;
        for (int each : array) {
        average= (average+=each)/ array.length;
        }

        System.out.println(average);

        }

    }






