package week04_AlgoQuestions;

public class QuestionTwo {
    public static void main(String[] args) {

        String str = "findFirstNonRepeatingVowel";
        System.out.println(findFirstNonRepeatingVowel(str));


    }

    public static String findFirstNonRepeatingVowel(String word) {
        word = word.toLowerCase();

        int count = 0;
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'
                    || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                result += word.charAt(i);
            }

            for (int j = 0; j < result.length(); j++) {

                for (int k = 1; k < result.length()-1; k++) {
                    if (result.charAt(j) == result.charAt(k)) {
                        continue;
                    }
                    count++;
                }
            }
        }
        return result + " " + count;
    }
}

/*
Question-2 First Non-repeating Vowel
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and
return its index. If it doesn't exist, return -1. Assume that all the characters of the String is lowercase.
( Do not use String class functions other than charAt() and length() )
 */