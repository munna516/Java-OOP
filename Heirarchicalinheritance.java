class A { // Super Class
    void input() {
        System.out.print("Enter Your Name : ");
    }
}

class B extends A { // Sub class
    void show() {
        System.out.println("My Name is Munna");
    }
}

class C extends A { // Sub class
    void disp() {
        System.out.println("My Name is Abrar");
    }
}

class D extends A {
    void ok() {
        System.out.println("My Name is Rahim");
    }
}

public class Heirarchicalinheritance {
    public static void main(String[] args) {
        B r1 = new B();
        C r2 = new C();
        D r3 = new D();
        r1.input();
        r1.show();
        r2.input();
        r2.disp();
        r3.input();
        r3.ok();
    }
}
/*
 * hierarchical Inheritance has one super class and multiple sub class & all the
 * sub class directly extends the super classes.
 */
