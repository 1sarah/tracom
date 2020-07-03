package databases;


import java.util.ArrayDeque;

public class Base {
    protected int a = 8;

    public static void main (String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
    }
}

class DerivedClass extends Base {
    private int b = 10;

    public int sum() {
        return a + b;
    }
}