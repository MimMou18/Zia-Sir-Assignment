class Bike {
    String model;
    int gearCount;

    void ride() {
        System.out.println("Bike is riding...");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Bike myBike = new Bike(); // object creation
        myBike.model = "Mountain Bike";
        myBike.gearCount = 18;
        myBike.ride();
    }
}
