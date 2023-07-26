package day28_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (Integer each : scores) {
            if (each <= 100 && each > 89) {
                countA++;
            }
            if (each >= 80 && each < 90) {
                countB++;
            }
            if (each >= 70 && each < 80) {
                countC++;
            }
            if (each >= 60 && each < 70) {
                countD++;
            }
            if (each >= 0 && each < 60) {
                {
                    countF++;
                }
            }
        }
        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
        System.out.println("countD = " + countD);
        System.out.println("countF = " + countF);
    }
}

/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */