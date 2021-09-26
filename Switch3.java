package com.company;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {
        System.out.println("Please write the first number:");
        Scanner numOne = new Scanner (System.in);
        int first = numOne.nextInt();

        System.out.println("Please write the second number:");
        Scanner numTwo = new Scanner (System.in);
        int second = numTwo.nextInt();

        System.out.println("Please write the option:");
        Scanner opt = new Scanner (System.in);
        char option = opt.next().charAt(0);

        switch (option) {
            case '+':
                System.out.println("The sum of both numbers is " + (first + second));
                break;
            case '-':
                System.out.println("The subtraction of both numbers is " + (first - second));
                break;
            case '/':
                System.out.println("The dividing of both numbers is " + (first / second));
                break;
            case '*':
                System.out.println("The multiplication of both numbers is " + (first * second));
                break;
            case '%':
                System.out.println("The dividing of both numbers with remainder is " + (first / (double)second));
                break;
            case 'p':
                System.out.println("The numbers are " + first + " and " + second);
                break;
            case 'b':
                if (first > second)
                System.out.println(first + " is bigger than " + second);
                else if (first < second)
                    System.out.println(second + " is bigger than " + first);
                break;
            case 's':
                if (first < second)
                    System.out.println(first + " is smaller than " + second);
                else if (first > second)
                    System.out.println(second + " is smaller than " + first);
                break;
            default:
                System.out.println("Invalid transaction. Please try another option");
                break;
        }

    }
}
