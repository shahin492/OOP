interface Animal {
    void sound();
}

class Cow implements Animal {
    public void sound() {
        System.out.println("Moo");
    }
}

public class Interface2{
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.sound();
    }
}
