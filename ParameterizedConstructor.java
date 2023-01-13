class A {
    int x;
    String y;

    A(int a, int b) {      // Parameterized Constructor
        System.out.println(a + " " + b);
    }

    A(int a, String b) {    // Parameterized Constructor
        x = a;
        y = b;
    }

    void display() {
        System.out.println(x + "  " + y);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        A r = new A(100, "Munna");
        r.display();
        A ref = new A(10, 20);

    }
}
