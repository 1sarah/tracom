package myproject;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = myObj.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
