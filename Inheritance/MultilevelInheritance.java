package Inheritance;

public class MultilevelInheritance {
    int salary;
    String name;

    MultilevelInheritance() {
        salary = 0;
        name = null;
    }

}

class B extends MultilevelInheritance {
    int id;
    String post;

    B() {
        id = 0;
        post = null;
    }

}

class C extends B {
    C(int i, int s, String n, String p)

    {
        id = i;
        salary = s;
        name = n;
        post = p;

    }

    void display() {
        System.out.println(salary);
        System.out.println(name);
        System.out.println(id);
        System.out.println(post);
    }
}
