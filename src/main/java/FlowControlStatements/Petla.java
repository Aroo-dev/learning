package FlowControlStatements;

public class Petla {

    public static void main(String[] args) {
        int sumOfDigits = sumFirstAndLastDigit(2235);
        System.out.println(sumOfDigits);
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int digit1 = 0;
        int digit = number % 10;
        int sum = 0;
        for (int i = number; number != 0 ;) {
             digit1 = number % 10;
             number = number /10;


        }
        return digit + digit1;
    }

}
