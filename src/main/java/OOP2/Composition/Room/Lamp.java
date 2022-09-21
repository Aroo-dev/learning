package OOP2.Composition.Room;

public class Lamp {
    private String model;
    private String manufacturer;
    private Dimensionsx dimmensions;
    private String color;

    public void lampPower(){
        System.out.println("lamp is lightning");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensionsx getDimmensions() {
        return dimmensions;
    }

    public String getColor() {
        return color;
    }
    public void turnOn(){
        System.out.println("turning on the light");
    }

    public Lamp(String model, String manufacturer, Dimensionsx dimmensions, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimmensions = dimmensions;
        this.color = color;
    }
}
