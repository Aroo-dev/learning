package OOP2.masterchallange;

/**
 * Created by dev on 11/08/15.
 */
public class Hamburger {
    private  String name;
    private  String meat;
    private  double price = 4.30;
    private  String breadRollType;


    private  double tomatoPrice = 2.19;




    private  double eggsPrice = 2.13;
    private  double totalPriceEggs;

    private String onion;
    private  double onionPrice = 3.34;
    private  double totalPriceOnion;


    private  double sausagePrice = 2.13;
    private  double totalPriceSausage;

    public double getPrice() {
        return price;
    }

    public Hamburger(String name, String meat, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public double addHamburgerAddition1(int tomatoAmount) {
            double totalPrice = tomatoAmount;

        if (tomatoAmount > 0) {

            totalPrice *= tomatoPrice;
        }
        return totalPrice;
    }

    public double addHamburgerAddition2(int eggsAmount) {
        double totalPrice = eggsAmount;
        if (eggsAmount > 0) {

            totalPrice *= this.eggsPrice;
        }
        return totalPrice;
    }

    public double addHamburgerAddition3(int onionAmount) {
        double totalPrice = onionAmount;
        if (onionAmount > 0) {

            totalPrice *= this.onionPrice;

        }
        return totalPrice;

    }

    public double addHamburgerAddition4(int sausageAmount) {
        double totalPrice = sausageAmount;
        if (sausageAmount > 0) {

            totalPrice *= this.sausagePrice;
        }
        return totalPrice;
    }
    public double burger (){

        double totalPrice = this.price;
        System.out.println("total price for burger is  = "  + totalPrice);
        if (totalPriceTomato > 0){
            totalPrice += totalPriceTomato;
        }
        return totalPrice;
    }



}