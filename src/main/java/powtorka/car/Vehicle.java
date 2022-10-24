package powtorka.car;

public class Vehicle {
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }
    public void accelerate (){
        System.out.println("vehicle starts");
    }
    public void gearChanger (int gear){
        if (gear ==1 ){
            accelerate();
            System.out.println("you are now moving");
        } else if( gear ==2  ){
            System.out.println("you change the gear on " + gear);
        }
        else {
            System.out.println(" car in a neutral gear, change gear to start");
        }


    }
}

