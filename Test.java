class Demo {
    int x = 15;
    String y = "Mehdei Hasan Munna";

    void show() {
        System.out.println(+x + "   " + y);
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }
    void sub(){
        System.out.println("This is Sub Method");
    }
}

public class Test {
    public static void main(String[] args) {
        Demo t = new Demo();
        t.show();
        t.add(6, 7);
      // Finish
    }

}