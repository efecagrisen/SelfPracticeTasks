package day28_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));

        int temp = numbers.get(0);

        System.out.println(temp); // in order not to lose index 0 we first pull it out from the arraylist in a temp variable

        numbers.set(0,numbers.get(numbers.size()-1)); // then we assign the last element to index 0

        numbers.set(numbers.size()-1,temp); // lastly we assign the index 0 which we stored in the temp variable to the last element of the arraylist
        System.out.println(numbers);




    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */