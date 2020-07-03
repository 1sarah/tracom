package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number (int): ");
        int a = in.nextInt();

        System.out.print("Enter 2nd number (int): ");
        int b = in.nextInt();

        System.out.print("Enter 3rd number (int): ");
        int c = in.nextInt();

        System.out.print("Enter 4th number (int): ");
        int d = in.nextInt();

        double avg = (double) (a + b + c + d) / 4;
        System.out.println(avg);

        int [] nums = {a, b, c, d};
        Arrays.sort(nums);
        int midIndex = nums.length / 2;
        int median = nums[midIndex];
        System.out.println(median);

        // print biggest
        int biggest = nums[nums.length - 1];
        System.out.println(biggest);


        //double avg = Average.average(a, b, c);
        //System.out.println("The average is: " + avg);









//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter 1st number (int): ");
//        int a = in.nextInt();
//
//        System.out.print("Enter 2nd number (int): ");
//        int b = in.nextInt();
//
//        System.out.print("Enter 3rd number (int): ");
//        int c = in.nextInt();
//
//        double avg = Average.average(a, b, c);
//        System.out.println("The average is: " + avg);
    }

    public static double average (int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

}
