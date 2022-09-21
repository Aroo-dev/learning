package OOP2.Composition.Room;

import FlowControlStatements.TeenNumberChecker;
import OOP.personTask.Person;

public class Bed {
    private String model;
    private String manufacturer;
    private Dimensionsx dimensionsx;


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensionsx getDimensionsx() {
        return dimensionsx;
    }


    public Bed(String model, String manufacturer, Dimensionsx dimensionsx) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensionsx = dimensionsx;
    }
    public void makeBed(){
        System.out.println("making bed");
    }
}
