package interfac.exercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> writeValue = new ArrayList<>();
        writeValue.add(0,name);
        writeValue.add(1,weapon);
        writeValue.add(2, "" + hitPoints);
        writeValue.add(3, "" + strength);
        return writeValue;
    }

    @Override
    public void read(List<String> savedValues) {
            if (savedValues != null && savedValues.size() >0){
                this.name = savedValues.get(0);
                this.weapon = savedValues.get(1);
                this.hitPoints = Integer.parseInt(savedValues.get(2));
                this.strength = Integer.parseInt(savedValues.get(3));
        }
    }
}
