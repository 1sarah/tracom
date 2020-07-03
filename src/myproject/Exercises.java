package myproject;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        calculateGrade();
    }

    public static int reverse(int N) {
//        int num;
//        String s;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        num = input.nextInt();
//
//        //s = "" + num;
//
//        String reversedStr = reverseHelper(N);
//
//        int reversedNum = Integer.parseInt(reversedStr);
//
//        return reversedNum;
        return N;
    }

    public static String reverseHelper(int n, String s) {
        if (n == 0) {
            return s;
        }
        s = s + n % 10;
        return s + reverseHelper(n/10, s);
    }

    public static void calculateGrade() {
        int marks;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");

        marks = input.nextInt();

        if (marks < 0){
            System.out.println("Invalid input");
        }
         if (marks <= 39) {
            System.out.println("FAIL");
        }
        else if ( marks <= 50) {
            System.out.println("D");
        }
        else if ( marks <= 60) {
            System.out.println("C");
        }
        else if ( marks <= 70) {
            System.out.println("B");
        }
        else if ( marks <= 100) {
            System.out.println("A");
        }
        else {
            System.out.println("Invalid input");
        }


    }
}
