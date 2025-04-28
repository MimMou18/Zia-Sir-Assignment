interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
public class Interface {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
