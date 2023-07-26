package day24_ReturnMethods;

import java.util.Arrays;
import java.util.Scanner;

public class $2_IsAnagram {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        // str1 = "Silent";
        // str2 = "silent";

        System.out.println(isAnagram(str1,str2));

    }

    public static boolean isAnagram (String str1, String str2){

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        //char[] arr1 = str1.toCharArray(); // case sensitive
        //char[] arr2 = str2.toCharArray(); // case sensitive

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return (Arrays.equals(arr1,arr2));

    }

}


/*
 2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    Ex:
        str1 = "cba"
        str2 = "bac";

        isAnagram(str1, str2) ====> true
 */
