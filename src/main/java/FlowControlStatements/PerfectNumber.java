package FlowControlStatements;

public class PerfectNumber {
    public static void main(String[] args) {
   boolean perfectNumber = isPerfectNumber(5);
        System.out.println(perfectNumber);
    }
    public static boolean isPerfectNumber (int number) {
        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i <number; i++) {
            if (number % i == 0){
                sum = sum + i;
             }


        }
        return number == sum;

    }
}
