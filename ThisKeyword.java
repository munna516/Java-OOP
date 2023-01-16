public class ThisKeyword {
    // void show() { // refers to the current object
    // System.out.println(this);
    // }
    int a;

    ThisKeyword(int a) {
        this.a = a; // here this.a is a = instance variable & only a is local veriable
    }

    void show() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisKeyword r = new ThisKeyword(100);
        // System.out.println(r);
        // r.show();
        r.show();
    }
}
