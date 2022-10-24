package powtorka.Vipcustromer;

public class Main {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("bob", 24000);
        System.out.println(person2.getName());
        System.out.println(person2.getEmail());
        VipCustomer person3 = new VipCustomer("tim", 244444, "axxrxxo@gmail.com");
        System.out.println(person3.getCreditLimit());
    }
}
