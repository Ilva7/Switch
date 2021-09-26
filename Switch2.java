package com.company;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        System.out.println("Please insert the grade level:");
        Scanner studentGrade = new Scanner(System.in);
        char grade = studentGrade.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Invalid grade level. Please choose a letter from A to F");
                break;
        }
    }
}
