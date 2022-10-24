package powtorka.bankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double depositFunds( double depositAmount){
        this.balance += depositAmount;
        return this.balance;
    }
    public double withdrawal ( double withdrawalAmount ){
       if (balance - withdrawalAmount < 0){
           System.out.println("only " + balance + "available. withdrawal not  processed. ");
           return -1;
       } else{
           this.balance -= withdrawalAmount;

       }
           return balance;

    }
}

