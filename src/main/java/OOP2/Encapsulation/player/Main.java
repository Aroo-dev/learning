package OOP2.Encapsulation.player;

import OOP2.Encapsulation.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer  = new Printer(20,true);
        System.out.println(printer.getPagesPrinted());
        printer.addToner(20);
        System.out.println(printer.addToner(50));
        printer.printPages(20);
        System.out.println(printer.getPagesPrinted());
    }
}
