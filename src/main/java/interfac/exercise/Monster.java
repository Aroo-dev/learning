package interfac.exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> savedValues = new ArrayList<>();
        savedValues.add(0,name);
        savedValues.add(1, "" + hitPoints);
        savedValues.add(2, "" + strength);
        return savedValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() >0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }

    }
}
