package myproject;

public interface Interface2 {
}

interface Paint2 {
    void printing();
}

interface Color {
    void display();

    static int area (int length, int width) {
        return length * width;
    }
}

interface Color3 extends Paint2 {
    void display();
}

class interface3 implements Color3 {
    public void printing() {
        System.out.println("From paint interface");
    }

    public void display() {
        System.out.println("From color interface");
    }

    public static void main (String[] args) {
        interface3 ex3 = new interface3();
        ex3.printing();
        ex3.display();
        System.out.println(Color.area(2, 3));
    }
}
