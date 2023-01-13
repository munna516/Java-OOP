class Teacher {
    String name, gander;
    int phone;

    void setinformation(String n, String g, int p) {
        name = n;
        gander = g;
        phone = p;
    }

    void information() {
        System.out.println("Name of the Teacher : " + name);
        System.out.println("Gander of the Teacher : " + gander);
        System.out.println("Phone Number of the Teacher : " + phone);
        System.out.println("\n\n");
    }
}

public class Basic {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.setinformation("Mr. Rahim", "Male", 178366);
        Teacher1.information();

        Teacher Teacher2 = new Teacher();
        Teacher2.setinformation("Mrs. Anika", "Female", 3837389);
        Teacher2.information();
    }
}
