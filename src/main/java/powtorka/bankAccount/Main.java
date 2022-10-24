package powtorka.bankAccount;
import OOP2.masterchallange.Hamburger;

public class Main {
    public static void main(String[] args) {

        Hamburger klaudia = new Hamburger("hamburger", "well done", "white bread");
        klaudia.addHamburgerAddition4(2);
        klaudia.addHamburgerAddition2(3);

        System.out.println(klaudia.burger());
        klaudia.addHamburgerAddition1(1);
        System.out.println(klaudia.burger());




    }
}
