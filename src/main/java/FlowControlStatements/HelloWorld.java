package FlowControlStatements;

public class HelloWorld {
    public static void main(String[] args) {
        int highscoreposition = calculateHighScorePositon(1500);
        displayHighScorePosition("Artur1", highscoreposition);
        displayHighScorePosition("Artur", calculateHighScorePositon(1500));
        displayHighScorePosition("Dariusz", calculateHighScorePositon(1000));
        displayHighScorePosition("Radosław", calculateHighScorePositon(400));
        displayHighScorePosition("Agnieszka" , calculateHighScorePositon(50));
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " you managed to get into position " + position
                + " on the high score table");

    }

    public static int calculateHighScorePositon(int playerScore) {
        if (playerScore > 1000){
            return 1;
        } else if (playerScore >= 500 ) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

    }
}


