package FlowControlStatements;

public class getLargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(3));
    }

    public static boolean isPrime( int number){
        for (int i = 2; i <number ; i++) {
            if (number % i == 0){
                return false;
            }

        }
        return true;
    }
    public static int getLargestPrime( int number){

        if (number <= 1){
            return -1;

        }
        int largestPrime = 0;
        for (int i = 2; i <number ;i++ ) {
            if (number % i == 0 && isPrime(i) ){
                largestPrime = i;
            }

        }
        return largestPrime;
    }
}
