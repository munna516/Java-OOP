package Introduction;

/*we do create any object for static variable or Method,We call it using class name.
 * static Member is related to Class.
 * Static Method Can not access non static memeber
 * Static Method Can not use super & this Keyword
 */
public class StaticVariableMethod {
    int x = 10;
    static String uniname = "Daffodil International University";

    void display1() {
        System.out.println("This is Non static Method");
    }

    static void display2() {
        // display1();
        // System.out.println(x);
        System.out.println("This is Static Variable");
    }
}
