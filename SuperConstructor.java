class A {
    A(int x, String s) {
        System.out.println("Hello World" + " " + x + " " + s);
    }
}

/*
 * If the super class has perameterized constructor then we have to pass
 * argument
 * inside the super() keyword.
 */
class B extends A {
    B() {
        super(100, "Munna");
        System.out.println("Hello Bangladesh");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        B r = new B();
    }
}
