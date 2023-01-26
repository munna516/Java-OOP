abstract class Animal {
    Animal() {
        System.out.println("This is our Animal Class......");
    }

    public abstract void sound();

}

class Dog extends Animal {
    Dog() {
        super();
    }

    public void sound() {
        System.out.println("The dog is barking.");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("The Lion is Roar.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog r = new Dog();
        r.sound();
        Lion l = new Lion();
        l.sound();
    }
}
