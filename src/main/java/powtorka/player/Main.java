package powtorka.player;

import java.beans.Encoder;

public class Main {
    public static void main(String[] args) {
//        Player player1 = new Player();
//        player1.name =  "tim";
//        player1.health = 20;
//        player1.weapon = "sword";
//        int damage =  10;
//        player1.loseHealth(10);
//        System.out.println("remaining health  = "  + player1.healthRemaining());
//        player1.loseHealth(11);
//        System.out.println("remaining health  = " + player1.healthRemaining());
//    }
        EnhancedPlayer player = new EnhancedPlayer("Artur", 50, "sword");
        player.getHealth();
    }
}
