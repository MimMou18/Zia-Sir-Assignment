interface Playable {
    void playInstrument();
}

interface Singable {
    void sing();
}

class Musician implements Playable, Singable {
    public void playInstrument() {
        System.out.println("Musician is playing an instrument...");
    }

    public void sing() {
        System.out.println("Musician is singing...");
    }
}
public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        Musician m = new Musician();
        m.playInstrument();
        m.sing();
    }
}
