package powtorka.room;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("xxx", 1, 120, 2, 1);

        Wall wall1 = new Wall("east");
        Wall wall2 = new Wall("west");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");
        Ceiling ceiling = new Ceiling(120, 2);
        Lamp lamp = new Lamp("sss", true, 2);

        Bedroom bedroom = new Bedroom("arosBed", wall1, wall2, wall3, wall4,ceiling, bed, lamp);

        bedroom.makeBed();

    }
}
