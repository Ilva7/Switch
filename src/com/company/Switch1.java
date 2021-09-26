package com.company;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        System.out.println("Please insert the number of the day in the week:");
        Scanner dayOfTheWeek = new Scanner (System.in);
        int day = dayOfTheWeek.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;

            case 6:
            case 7:
                System.out.println("It is holiday");
                        break;

            default:
                System.out.println("Invalid day number. Please choose a number between 1 and 7");
                break;
        }

    }
}
