package myproject;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<>();
        // Add elements
        String c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer (q to quit): ");
        c = in.next();
        while (! c.equals("q")) {
            int i = Integer.parseInt(c);
            myVector.add(i);
            System.out.print("Enter an integer (q to quit): ");
            c = in.next();
        }
//        myVector.add(4);
//        myVector.add(8);
//        myVector.add(6);

        // Iterating
        Iterator<Integer> iterator = myVector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
