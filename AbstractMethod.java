abstract class programming {
    public abstract void Developer();

}

class HTML extends programming {
    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
}

class Java extends programming {
    @Override
    public void Developer() {
        System.out.println("James Gosling");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        programming h = new HTML();
        h.Developer();
        programming j = new Java();
        j.Developer();
    }
}
