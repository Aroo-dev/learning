package OOP.wall;
import OOP2.masterchallange.Hamburger;
public class Main {
        public static void main(String[] args){

    Hamburger hamburger = new Hamburger("Burger", "well done", "white bread");

    double x  =  hamburger.addHamburgerAddition1(1);
            System.out.println(x);
         double y = hamburger.addHamburgerAddition2(1);
            System.out.println(y);
            double z  = hamburger.addHamburgerAddition4(1);
            System.out.println(z);
            System.out.println((hamburger.getPrice() + z));

            System.out.println(hamburger.burger());





    }
}