package myproject;

public class Triangle {
    private int b, h, hyp;

    public Triangle() {
        b = 5; h = 9; hyp = 13;
    }

    public double area() {
        return 0.5 * b * h;
    }

    public int perimeter() {
        return b + h + hyp;
    }

    public static void main(String[] args) {
        Triangle right = new Triangle();

        System.out.print("Area: ");
        System.out.println(right.area());

        System.out.print("Perimeter: ");
        System.out.println(right.perimeter());
    }
}
