package Introduction;

public class Main {
    public static void main(String[] args) {

        A a = new A(); // Object create
        a.age = 21;
        a.name = "Mehedi Hasan Munna"; // Set the value using ref variable a
        a.display();

        Employee em = new Employee(10000, "Manager");
        em.display(9.9);
        ConstructorOverloading c = new ConstructorOverloading();
        ConstructorOverloading c1 = new ConstructorOverloading(20, "MUNNA");
        c1.display();
        ConstructorOverloading c2 = new ConstructorOverloading(10, "X", 10000);
        c2.display();

        System.out.println("University Name : " + StaticVariableMethod.uniname);
        StaticVariableMethod.display2();

        StaticBlock s = new StaticBlock();
        StaticBlock.display();

        Thiskeyword th = new Thiskeyword(10, 20, 30);
        th.display();

    }
}