package OOP2.Composition.Room;

public class Main {
    public static void main(String[] args) {


    Wall wall1 = new Wall("west");
    Wall wall2 = new Wall("east");
    Wall wall3 = new Wall("south");
    Wall wall4 = new Wall("north");
    Bed bed = new Bed("xxx" ,"Asus", new Dimensionsx(120,150));
    Ceiling ceiling = new Ceiling("blue");
    Lamp lamp =  new Lamp("xx2 ", "samsung" , new Dimensionsx(20 , 40) , "blue");
    Room room = new Room(bed,wall1, wall2, wall3, wall4, ceiling, lamp);
    room.makeBed();
    }
}
