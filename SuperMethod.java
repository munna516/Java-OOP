class A { // Super Class
    void show() {
        System.out.println("Good Morning Everyone");
    }
}

class B extends A { // Sub Class
    void show() {
        super.show(); // Calling super classes method
        System.out.println("Thank You Everybody");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}
