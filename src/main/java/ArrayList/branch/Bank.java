package ArrayList.branch;

import java.util.ArrayList;

public class Bank {
private String name;
private ArrayList< Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
    private Branch branch;
}
