package OOP.bankAccount;

public class Main {


    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();//("73745074444479", 0.00, "Bob Brown" ,
               // " axxrxxo@gmail.com", "7374507779");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getCustomerName());
        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(50);
        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        BankAccount timsaccount =  new BankAccount("tim", " axxrxxo@gmail.com", "12345555" );
        System.out.println(timsaccount.getNumber() + " name " + timsaccount.getCustomerName());

    }
}
