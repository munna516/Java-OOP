class A {
    private int x; // data hiding
    private String s;

    public void setvalue(int x, String s) {  // setter method
        this.x = x;
        this.s = s;
    }

    public int getvalue() {  //getter method
        return ++x;
    }

    public String getvalues() {  //getter method
        return s;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setvalue(19, "Munna");
        System.out.println(r.getvalue());
        System.out.println(r.getvalues());
    }
}
