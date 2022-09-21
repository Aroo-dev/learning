package OOP2.Composition.Room;

public class Room {
    private Bed bed;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall Wall4;

    public Room(Bed bed, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {
        this.bed = bed;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.Wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    private Ceiling ceiling;
    private Lamp lamp;

    private void makingBed(){
        System.out.println("you just made bed, so you can go to sleep");
    }
    public void makeBed(){
       lamp.turnOn();
        bed.makeBed();
        makingBed();



    }
}
