package myproject;

interface MyInterface {
    public void methodInterface();
    public static float value = 20;
}

class myClass implements MyInterface {
    @Override
    public void methodInterface() {
        System.out.println("From my interface class");
    }

    public static void main (String[] args) {
        System.out.println("Implements from my interface " + MyInterface.value);
    }
}
