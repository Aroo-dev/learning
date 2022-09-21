package FlowControlStatements;

public class Topscore {
    public static void main(String[] args) {



       int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score is " + highscore);

        calculateScore(true,10000, 8, 200);


        }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score + (levelCompleted * bonus);
        if (gameOver) {
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -0;




    }
}
