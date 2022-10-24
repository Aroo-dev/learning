package powtorka.car;

public class Car extends Vehicle {
    private String model;
    private int wheels;
    private int gears;

    public Car(String color, String model, int wheels, int gears) {
        super(color);
        this.model = model;
        this.wheels = wheels;
        this.gears = gears;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    @Override
    public void gearChanger(int gear) {
        super.gearChanger(gear);
    }
}

