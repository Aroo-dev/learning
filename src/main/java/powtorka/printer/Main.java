package powtorka.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("initial page count " + printer.getPagesPrinted());
        int pagesPrinted = printer.pagesPrinted(4);
        System.out.println(printer.getPagesPrinted());
        printer.pagesPrinted(5);
        System.out.println(printer.getPagesPrinted());
        printer.pagesPrinted(2);
        System.out.println(printer.getPagesPrinted());
        printer.fillUpToner(-1);
        System.out.println(printer.getTonerLevel());

    }
}
