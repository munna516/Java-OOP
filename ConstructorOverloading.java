class A {
    int a;
    double b;
    String c;
    // We Can not use private & default constructor at a time
    A(int x, double y, String z) {
        a = x;
        b = y;
        c = z;
    }

    A() {
        a = 100;
        b = 23.45;
        c = "Munna";
    }

    A(int x) {
        a = x;
    }

    A(double y, String z) {
        b = y;
        c = z;
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        A ref = new A();
        A ref2 = new A(89);
        A ref3 = new A(25.67, "Karim");
        A ref4 = new A(26, 87.67, "Muktar");
        System.out.println("Expected result is : " + ref.a + " " + ref.b + " " + ref.c);
        System.out.println("Expected result is : " + ref2.a);
        System.out.println("Expected result is : " + ref3.b + " " + ref3.c);
        System.out.println("Expected result is : " + ref4.a + " " + ref4.b + " " + ref4.c);
    }
}
