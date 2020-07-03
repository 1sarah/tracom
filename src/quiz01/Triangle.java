package quiz01;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    public Triangle () {
        this (6, 12, 13);
    }

    public Triangle (int a, int b, int c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }


    double perimeter () {
        return sideA + sideB + sideC;
    }

    /* uses herons formula
     * area = s(s-a)(s-b)(s-c) where s = perimeter / 2
     */
    double area() {
        double s = perimeter() / 2;
        return s * (s - sideA) * (s - sideB) * (s - sideC);

    }

    public static void main (String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.perimeter());
        System.out.println(t.perimeter());

    }
}
