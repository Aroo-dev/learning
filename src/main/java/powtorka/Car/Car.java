package powtorka.Car;

public class Car {
    private int doors;
    private int wheels;
     private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        model = model.toLowerCase();
        if (model.equals("carrera") || model.equals("xxxx")) {
            this.model = model;
        } else {
            this.model = " model is unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
