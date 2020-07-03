package myproject;


// Method overriding
class Animal {

    public void sound() {
        System.out.println("blah blah...");
    }
}

class Dog extends Animal {

    public static void main(String[] args) {
        //creating an object of the dog(child class) class
        Dog d = new Dog();
        //This will call the child class version of sound()
        d.sound();

    }

    public void sound() {
        System.out.println("woof woof!");
    }
}