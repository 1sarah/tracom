package myproject;

import java.io.IOException;

public class ThrowException {

    public static void checkAgeLimit (int myage) {
        if ( myage > 20) {
            throw new ArithmeticException("You are not allowed to take alcohol");
        } else {
            System.out.println("You are allowed to take alcohol");
        }
    }

    void method1() throws IOException {
        throw new IOException("Error from device");
    }

    void method2() throws IOException{
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("handling");
        }
    }

    public static void main (String[] args) {
        checkAgeLimit(29);
        System.out.println("Let's continue.");
        ThrowException th = new ThrowException();
        th.method3();
        System.out.println("Running...");
    }

}
