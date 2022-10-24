package OOP2.masterchallange;

import java.math.BigDecimal;

/**
 * Created by dev on 11/08/15.
 */
public class Hamburger {
    private String name;
    private String meat;
    private double price = 4.30;
    private String breadRollType;
    private double totalPrice;

    private double tomatoPrice = 2.19;


    private double eggsPrice = 2.13;

    private double onionPrice = 3.34;



    private double sausagePrice = 2.13;

    public double getPrice() {
        return price;
    }

    public Hamburger(String name, String meat, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public double addHamburgerAddition1(int tomatoAmount) {
        double additionalTomatoPrice = tomatoAmount;

        if (tomatoAmount > 0) {

            additionalTomatoPrice *= tomatoPrice;

        }
        this.totalPrice = this.totalPrice + additionalTomatoPrice;
        return totalPrice;
    }

    public double addHamburgerAddition2(int eggsAmount) {
        double totalAdditionalPrice = eggsAmount;
        if (eggsAmount > 0) {

            totalAdditionalPrice *= this.eggsPrice;
        }
        this.totalPrice += totalAdditionalPrice;
        return this.totalPrice;
    }

    public double addHamburgerAddition3(int onionAmount) {
        double totalAdditionalPrice = onionAmount;
        if (onionAmount > 0) {

            totalAdditionalPrice *= this.onionPrice;

        }
        this.totalPrice += totalAdditionalPrice;
        return this.totalPrice;

    }

    public double addHamburgerAddition4(int sausageAmount) {
        double totalAdditionalPrice = sausageAmount;
        if (sausageAmount > 0) {

            totalAdditionalPrice *= this.sausagePrice;
        }
        this.totalPrice += totalAdditionalPrice;
        return this.totalPrice;
    }

    public double burger() {

        System.out.println("your " + this.name + " contains  " + this.meat + " meat on a "
                + this.breadRollType + " total price is:");

        return  totalPrice + price;



    }
}