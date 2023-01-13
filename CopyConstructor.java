class Copy {
    int a;
    String b;

    Copy() {
        a = 15;
        b = "Learn Programing";
        System.out.println(a + " " + b);
    }

    Copy(Copy R) { // Class Name & a Reference variable
        a = R.a;
        b = R.b;
        System.out.println(a + " " + b);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Copy ref = new Copy();
        Copy ref1 = new Copy(ref);
    }
}
