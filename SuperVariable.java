class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void show() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}

/*

 * Super keyword access the super classes variable if super classes variable
 * & the sub classes variable are same.
 
 */