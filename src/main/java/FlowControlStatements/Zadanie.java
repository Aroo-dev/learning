package FlowControlStatements;

public class Zadanie {

    public static void main(String[] args) {
        int count = 0;
        int sum = 1;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)) {
                sum *= i;
                count++;
                System.out.println(i + " is a prime number");
            if (count == 3) {
                break;
            }
            }

        }
        System.out.println(sum);

    }

    public static boolean isPrime( int n){
        if (n == 1 ){
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}



