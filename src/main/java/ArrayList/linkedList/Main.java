package ArrayList.linkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Artur", 12.04);
        Customer anotherCustomer;
        anotherCustomer  = customer;
        anotherCustomer.setBalance(111.32);
        System.out.println("customer + " + customer.getName() + " balance is " + customer.getBalance());
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(12);
        for (int i = 0; i <integerArrayList.size() ; i++) {
            int value = integerArrayList.get(i);
            System.out.println(value);

        }
        integerArrayList.add(1, 3);
        for (int i = 0; i <integerArrayList.size() ; i++) {
            int value = integerArrayList.get(i);
            System.out.println(value);

        }
    }

}
