package ArrayList.branch;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer (String name, double initialAmount){
        if (findCustomers(name) != null){
            this.customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction (String name, Double initialDouble){
        Customer existingCustomer = findCustomers(name);
        if (existingCustomer == null){
            existingCustomer.addTransactions(initialDouble);
            return true;
        }
        return false;
    }
    private Customer findCustomers ( String name ){
        for (int i = 0; i < customers.size(); i++) {
            Customer existingCustomer = customers.get(i);
            if (existingCustomer.getName().equals(name)){
                return existingCustomer;
            }

        }
        return null;
    }
}
