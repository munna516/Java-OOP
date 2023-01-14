class A {
    int a, b, c;

    A() {
        a = 10;
        b = 20;
        System.out.println("Here a : " + a + " & b : " + b);
    }

    void add() {
        c = a + b;
        System.out.println("Sum is a+b : " + c);
    }

    void sub() {
        c = b - a;
        System.out.println("Sub is b-a : " + c);
    }
}

class B extends A {
    void multi() {
        c = a * b;
        System.out.println("Multiplication is a*b : " + c);
    }

    void div() {
        c = b / a;
        System.out.println("Divission is b/a : " + c);
    }
}

class C extends B {
    void rem() {
        c = b % a;
        System.out.println("Remainder is a%b : " + c);
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}
