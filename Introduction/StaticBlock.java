package Introduction;

/*Static Block Execute before other Method */
public class StaticBlock {
    int x, y;

    StaticBlock() {
        System.out.println("This is Constructor");
    }

    static {
        System.out.println("This is Static Block");
    }

    static void display() {
        System.out.println("This is Static Method");
    }
}
