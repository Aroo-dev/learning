package FlowControlStatements;

public class MegaBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(77777777);
        System.out.println();
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int gigaByte = kiloBytes / 102400;
        int remaing2 = kiloBytes % 102400;
        int megaBytes = kiloBytes / 1024;
        int remaining = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else System.out.println(kiloBytes + " KB = " + gigaByte + " gigabytes" + "and " +  megaBytes + " MB " + " and "  + remaining + " KB " );


    }
}
