class student {    // Super Class 
    int roll, marks;
    String name;

    void input() {
        System.out.println("Enter your name roll & marks :  ");
    }
}

class SimpleInheritance extends student {  // Sub Class
    void disp() {
        roll = 10;
        marks = 89;
        name = "Munna";
        System.out.println(name + " " + roll + " " + marks);
    }

    public static void main(String[] args) {
        SimpleInheritance r = new SimpleInheritance();
        r.disp();
    }
}
 /*Simple Inheritance hava only one super class  a sub class  */
