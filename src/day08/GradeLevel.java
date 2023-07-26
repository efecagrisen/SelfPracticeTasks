package day08;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade = 19;
        if(grade>=1 && grade<= 18){
            if (grade<6){
                System.out.println("Elementary School");
            } else if (grade<9) {
                System.out.println("Middle School");
            } else if (grade<13) {
                System.out.println("High School");
            } else if (grade<17) {
                System.out.println("Collage");
            }else {
                System.out.println("Grad School");
            }
        }else {
            System.out.println("Invalid");
        }


        /*
        2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
         */
    }
}
