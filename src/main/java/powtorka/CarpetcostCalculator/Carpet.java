package powtorka.CarpetcostCalculator;

public class Carpet {
    private double cost;

    public double getCost() {
        return cost;
    }

    public Carpet(double cost) {
        if (cost < 0){
            cost  = 0;
        } else {
            this.cost = cost;
        }

    }
}