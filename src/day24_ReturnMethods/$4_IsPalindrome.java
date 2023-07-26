package day24_ReturnMethods;

import java.util.Scanner;

public class $4_IsPalindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(isPalindrome(word));

    }

    public static boolean isPalindrome(String word){

        return ($3_Reverse.reversed(word).equals(word))? true : false;


    }


}
/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */
