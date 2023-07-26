package day24_ReturnMethods;

public class $1_FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";

        System.out.println(frequencyOfWord(sentence,word));


    }

    public static int frequencyOfWord (String sentence, String word){

        String[] list = sentence.split(" ");

        int count = 0;
        for (String each : list) {
            if(each.toLowerCase().equals(word.toLowerCase()))
            count++;
        }
        return count;
    }

}

/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
    then returns the frequency of word from the sentence

    Ex:
        sentence = "Java java java python python"
        word = "java";
        frequencyOfWord(sentence, word) ==>  3
 */
