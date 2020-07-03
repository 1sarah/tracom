package myproject;

public class Student {
    String name;
    int idno;

    public Student(String name, int idno){
        this.name = name;
        this.idno = idno;
    }

    public static void main(String[] args) {
        Student me = new Student("John", 1234);
    }
}
