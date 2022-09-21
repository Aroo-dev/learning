package FlowControlStatements;

public class NumberToWords {
    public static void main(String[] args) {
        int count = getDigitCount(33344444);
        System.out.println(count);
     numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        number = reverse(number);
        int digit;
        for (; number !=0;) {

            digit = number % 10;

            if (digit == 0) {
                System.out.print("Zero");
            } else if (digit == 1) {
                System.out.print("One");
            } else if (digit == 2) {
                System.out.print("Two");
            } else if (digit == 3) {
                System.out.print("Three");
            } else if (digit == 4) {
                System.out.print("Four");
            } else if (digit == 5) {
                System.out.print("Five");
            } else if (digit == 6) {
                System.out.print("Two");
            } else if (digit == 7) {
                System.out.print("Seven");
            } else if (digit == 8) {
                System.out.print("Eight");
            } else {
                System.out.print("Nine");
            }
             number  = number / 10;

        }



    }
    public static int reverse ( int number1){
        int reverse = 0;
        int digit;

        for (; number1 !=0 ; ) {
            digit = number1 % 10;
            reverse = reverse * 10 + digit;
            number1 = number1 /10;
        }
        return reverse;
    }
    public static int getDigitCount ( int number){
        if (number < 0){
            return -1;
        }
        int count = 0;
        for ( ; number != 0 ; ) {
            count ++;
             number = number /10;
        }
        return count;
    }
}
