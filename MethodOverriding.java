class A {
    void show() {
        System.out.println("This is Super Class Method");
    }
}

class B extends A {
    void show() {
        super.show();
        System.out.println("This is Sub Class Method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}
