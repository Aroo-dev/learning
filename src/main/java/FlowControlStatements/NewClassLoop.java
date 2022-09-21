package FlowControlStatements;

public class NewClassLoop {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println("this is a prime number  = " + i);
                count++;
            }


                if (count == 3){
                    break;
                }
        }
        System.out.println(sum);




        for (int i = 2; i < 9; i++) {
            System.out.println("calculateInterest at " + i  + " = " + CalculateInterest(10000.0, i));
        }

        for (int i = 8; i >= 2 ; i--) {
            System.out.println("calculateInterest at " + i  + " = " + CalculateInterest(10000.0, i));
        }
    }

    public static double CalculateInterest(double amount, double interestRate) {
        return amount * (interestRate /100);


    }

    public static boolean isPrime(int n) {
        if (n == 1){
            return false;
        }
        for (int i =2; i <= n/2; i++){
            if (n % i == 0 ){
                return false;
            }
        }
        return true;

    }
}
