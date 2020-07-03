package myproject;

public class LectureCode {
}

class Fruits {
    void nature (){System.out.println("Sweet");}
}

class Mango extends Fruits {
    void nature() {
        System.out.println("Enjoy eating mango...");
    }

    public static void main(String[] args) {
        Fruits f = new Mango();
        f.nature();
    }
}


