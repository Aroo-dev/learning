package OOP2.Composition.thePc;

public class Main {
    public static void main(String[] args) {
//        Monitor monitor = new Monitor("Samsung", "dell", 15,new Resolution(22,22));
//        Monitor  monitor1 = new Monitor("toshiba", "toshiba,", 12, new Resolution( 23, 12));
//        System.out.println( monitor1.getNativeResolution());
//        System.out.println(monitor.getNativeResolution());

        Case theCase = new Case("220b","dell", "250", new Dimensions(20,21,10));
        Monitor theMonitor =  new Monitor("240inchBeast","acer,", 27, new Resolution(2540, 1440));
        MotherBoard motherBoard =  new MotherBoard("222cd", "asus", 4, 5, "v2.5");
        PC thePc =  new PC(theCase,theMonitor, motherBoard );
        thePc.powerUp();



    }
}
