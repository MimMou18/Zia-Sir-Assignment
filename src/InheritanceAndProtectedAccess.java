class Instrument {
    protected String category = "Musical Instrument";

    void show() {
        System.out.println("This is a musical instrument.");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println(category + " is playing a tune!");
    }
}
public class InheritanceAndProtectedAccess {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.show();
        g.play();
    }
}
