package FlowControlStatements;

public class Methids {

    public static void main(String[] args) {

        int highscore = calculatescore(true, 800, 5, 100);
        System.out.println("your final score is " + highscore);


        highscore = calculatescore(true, 10000, 8, 200);
        System.out.println("your final score is " + highscore);
    }

    public static int calculatescore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
}