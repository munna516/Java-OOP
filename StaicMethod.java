class method {
    void display1() {
        System.out.println("I am a non Static Method");
    }

    static void display2() {
        System.out.println("I am a Static Method");
    }
}

public class StaicMethod {
    public static void main(String[] args) {
        method ob = new method();
        ob.display1(); // we use object for call non static method
        method.display2(); // We use class for call static method.
    }
}
