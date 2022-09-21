package OOP.vipCustomer;

import OOP.bankAccount.BankAccount;

public class VipCustomer {
    private String name;

    public VipCustomer() {
        this("default Value", "default value", "default value");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, emailAddress, "default Value");

    }

    public VipCustomer(String name, String emailAddress, String creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    private String emailAddress;
    private String creditLimit;


    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}