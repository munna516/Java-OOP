class Student {
    String name; // Instace Variable
    int id; // Instance Variable
    static String university = "DIU"; // Static variable or class Variable

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name : " + name + "\t" + "Id : " + id + "\t" + "University : " + university);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student("Munna", 22115514);
        Student s2 = new Student("Karim", 22147123);
        Student s3 = new Student("Rahim", 22129678);
        s1.display();
        s2.display();
        s3.display();
    }
}
