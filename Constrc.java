 class A {
    int a;
    String name;

    A() {   //  Constructor 
        a = 15;
        name = "Mehedi Hasna Munna";
    }

    void con() {
        System.out.println(a + "  " + name);
    }
}

public class Constrc {
    public static void main(String[] args) {
        A ref = new A();
        ref.con();
    }
}
