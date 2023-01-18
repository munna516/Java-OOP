class A {
    int a, b;
    String c;

    A() {  // Constructor
        a = 60;
        b = 70;
        System.out.println(a + " " + b);
    }

    { // Instance Block
        a = 10;
        b = 20;
        System.out.println(a + " " + b);
    }

    void show() {   // Method
        a = 40;
        c = "Programming";
        System.out.println(a + " " + c);
    }
}

public class InstanceBlock {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}

// Intance Block execute first .
