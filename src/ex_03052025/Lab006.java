package ex_03052025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float [] marks= new float[5];
        System.out.println("please enter the marks1");
        marks[0]= sc.nextFloat();
        System.out.println("please enter the marks2");
        marks[1]= sc.nextFloat();
        System.out.println("please enter the marks3");
        marks[2]= sc.nextFloat();
        System.out.println("please enter the marks");
        marks[3]= sc.nextFloat();
        System.out.println("please enter the marks");
        marks[4]= sc.nextFloat();
        float avg  = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;

        System.out.println("your avg is-->  "+avg);
    }
}
