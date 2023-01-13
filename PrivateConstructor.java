class PrivateConstructor {
    int a;
    double b;
    String c;

    private PrivateConstructor() {
        a = 10;
        b = 56.67;
        c = "Programmer";
        System.out.println(a + " " + b + " " + c);
    }
    public static void main(String[] args) {
        PrivateConstructor ref = new PrivateConstructor();  
    }
}

// public class PrivateConstructor {
//     public static void main(String[] args) {
//         p ref = new p();   
//     }
// }
/* we can not access private constructor from another class */