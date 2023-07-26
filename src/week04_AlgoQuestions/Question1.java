package week04_AlgoQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Question1 {
    public static void main(String[] args) {

        String str = "aabbcde";
        System.out.println(countDuplicatedChars(str));


    }

    public static int countDuplicatedChars (String word){
        word = word.toLowerCase();

        int count = 0;
        for (int i = 0; i < word.length()-1; i++) {

            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
                break;
            }

        }
        return count;
    }

}

/*
Question-1 Count the number of Duplicated Chars
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
 */
