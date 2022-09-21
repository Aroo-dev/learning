package FlowControlStatements;

public class Loopexcercise {
    public static void main(String[] args) {

       CalculateInterest(100.00,2.0);


        for (int i = 2; i < 9; i++) {
            System.out.println("100.00 at " + i + "% interest = " + CalculateInterest(100.00, i));
        }
        int j;
        for (j = 8; j >=  2; j--){
                System.out.println("100.00 at " + j + "% interest = " + CalculateInterest(100.00, j));
            }
        }

        


    public static double CalculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));

    }
}
