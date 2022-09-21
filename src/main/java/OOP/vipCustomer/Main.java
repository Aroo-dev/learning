package OOP.vipCustomer;

public class Main {
    public static void main(String[] args) {
        VipCustomer person1 =  new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 =  new VipCustomer("bob", "222222", "axxrxxo@gmail.com");
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Jake", "xxxxxx");
        System.out.println(person3.getEmailAddress());
        System.out.println(person3.getCreditLimit());
    }
}
