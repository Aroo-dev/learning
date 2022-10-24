package powtorka.Vipcustromer;

public class VipCustomer {
  private String name;
  private double creditLimit;
  private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer() {
        this( "Artur", 1234, "axxrxxo@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"aromajaja111@gmail.com");

    }
}
