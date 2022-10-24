package powtorka.car;

public class Main {

    public static void main(String[] args) {
        Audi audi  = new Audi("blue", "A3", 4, 6, "2.0");
        audi.gearChanger(2);
        audi.gearChanger(1);
    }


}
