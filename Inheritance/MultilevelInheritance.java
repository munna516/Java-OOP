package Inheritance;

public class MultilevelInheritance {
    int salary;
    String name;

    MultilevelInheritance(int s, String n) {
        salary = s;
        name = n;
    }

}

class B extends MultilevelInheritance {
    int id;
    String post;

    B(int i, String p, String n, int s) {
        super(s, n);
        id = 0;
        post = null;
    }

}

class C extends B {
    int x;

    C(int i, String p, String n, int s, int x) {
        super(i, p, n, s);
        this.x = x;

    }

    void display() {
        System.out.println(salary);
        System.out.println(name);
        System.out.println(id);
        System.out.println(post);
    }
}
