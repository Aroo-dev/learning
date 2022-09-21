package OOP.bankAccount;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public BankAccount( String customerName, String email, String phoneNumber) {
        this("77373222227",19999, customerName,email,phoneNumber);
    }

    public BankAccount(){
        this("737450779", 2.50, "default name " , "Default adress" , "default phone");
        System.out.println("empty constuctor called");

    }
    public BankAccount( String number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account contructor with parameters called");
        this.number =  number;
        this.balance =  balance;
        this.customerName = customerName;
        this.email  = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withDrawAmmount) {
        if (this.balance - withDrawAmmount < 0) {
            System.out.println("Only " + this.balance + " available. withdrawal not processed");
        } else {
            this.balance -= withDrawAmmount;
            System.out.println("Withdrawal of " + withDrawAmmount + " processed." +
                    " Remaining balance = " + this.balance);

        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return  this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
