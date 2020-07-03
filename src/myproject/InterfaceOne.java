package myproject;

public interface InterfaceOne {
    void display();
    
    interface InterfaceTwo {
        void method();
    }
}

class NestedInterface implements InterfaceOne.InterfaceTwo {
    public void method () {
        System.out.println("This is an example of nested interface");
    }
    
    public static void main (String args []) {
        InterfaceOne.InterfaceTwo h = new NestedInterface();
        h.method();
    }
}

class MyInterfaceClass {
    interface interfaceOne {
        void interfaceMethod ();
    }
}

class NestedInterfaceInClass implements MyInterfaceClass.interfaceOne {
    public void interfaceMethod () {
        System.out.println("interface method");
    }

    public static void main (String [] args) {
        MyInterfaceClass.interfaceOne x = new NestedInterfaceInClass();
        x.interfaceMethod();  
    }
}