package powtorka.car;

public class Audi extends Car {
    private String engine;

    public Audi(String color, String model, int wheels, int gears, String engine) {
        super(color, model, wheels, gears);
        this.engine = engine;
    }

    @Override
    public void gearChanger(int gear) {
        super.gearChanger(gear);
    }
    public void speed(){
        System.out.println("the car is speeding");
    }
}
