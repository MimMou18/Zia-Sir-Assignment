abstract class Vehicle {
    abstract void move();

    void fuelUp() {
        System.out.println("Fueling up...");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving");
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
        myCar.fuelUp();
    }
}
