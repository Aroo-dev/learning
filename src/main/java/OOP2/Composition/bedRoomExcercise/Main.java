package OOP2.Composition.bedRoomExcercise;

public class Main {
    public static void main(String[] args) {
        Wall wall1=  new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("north");
        Wall wall4 =  new Wall("south");
        Ceiling ceiling = new Ceiling(20, 10);
        Lamp  lamp = new Lamp("long", true, 20);
        Bed bed = new Bed("low",2, 10,2,1 );
        Bedroom timsBeedrom = new Bedroom("Tim",wall1,wall2, wall3,wall4,ceiling,bed,lamp);
        timsBeedrom.makeBed();


    }
}
