class A {
    private int x;

    public void setvalue(int x) {
        this.x = x;
    }

    public int getvalue() {
        return ++x;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setvalue(19);
        System.out.println(r.getvalue());
    }
}
