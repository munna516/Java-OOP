package Introduction;

/* there are more then one constructor & it have different different parameter  */
public class ConstructorOverloading {
    int age, salary;
    String name;

    ConstructorOverloading() {
        System.out.println("NO Information");
    }

    ConstructorOverloading(int age, String name) {
        this.age = age;
        this.name = name;
    }

    ConstructorOverloading(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);
    }

    
}
