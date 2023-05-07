package Introduction;

class A {
    // Instance Variable
    int age;
    String name;

    A() { // Constructor
        age = 0;
        name = null;
    }

    // method
    void display() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}

class Employee {
    int salary;
    String post;

    // Parameterized Constructor
    Employee(int s, String p) {
        salary = s;
        post = p;
    }

    // Parameterized Method
    void display(double x) {
        System.out.println("The Salary of the " + post + " is " + salary + " & he is " + x + " out of 10");
    }
}

