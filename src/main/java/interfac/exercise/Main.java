package interfac.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ISaveable player1 = new Player("artur", 20,30);
        System.out.println(player1.write());
        System.out.println(player1.getClass());
    }
}
