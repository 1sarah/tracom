package myproject;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();
        myStack.push("Peter");
        myStack.push("Jane");
        myStack.push("Mary");
        myStack.pop();
        myStack.pop();

        for (Iterator<String> it = myStack.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}


/**
 * A linked hash set example
 * can accept null values
 */
class L {

    public static void main(String[] args) {
        LinkedHashSet<String> mySet = new LinkedHashSet<String>();
        mySet.add("Peter");
        mySet.add("Jane");
        mySet.add("Mary");
        mySet.add(null);

        for (Iterator<String> it = mySet.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
