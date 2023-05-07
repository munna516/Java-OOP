package Inheritance;

public class SimpleInheritance {
    int a, b, x = 10;
    String s;

    SimpleInheritance() {
        a = 0;
        b = 0;
        s = null;
    }

    void display1() {
        System.out.println("This is Parent Method ");
    }

}

class B extends SimpleInheritance {
    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }
}
