class A {
    int add() {
        int x, y, c;
        x = 10;
        y = 20;
        c = x + y;
        return c;
    }

    void add(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }

    void add(int a, double b) {
        double c;
        c = a + b;
        System.out.println(c);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        A r = new A();
        int p = r.add();
        System.out.println(p);
        r.add(10, 50);
        r.add(14, 17.5);
    }
}
