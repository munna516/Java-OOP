package Encapsulation;

public class Main {
    public static void main(String[] args) {
        SetterGetter sg = new SetterGetter();
        sg.setid(1111);
        sg.setname("Munna");
        System.out.println("Name : "+sg.getname());
        System.out.println("Id : "+sg.getid());
    }
}
