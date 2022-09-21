package OOP.car;

public class Vehicle {
    private String name;
    private int doors;

    private int wheels;
    private String color;

    public Vehicle(String name, int doors, int wheels, String color) {
        this.name = name;
        this.doors = doors;
        this.wheels = wheels;
        this.color = color;
    }


    public void moving (int moving) {
        
        System.out.println("Vehicle.moving() called" + " the moving of a vehicle is " + moving);
    }
    public void steer() {}
    

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }
}

