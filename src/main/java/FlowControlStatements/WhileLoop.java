package FlowControlStatements;

public class WhileLoop {
    public static void main(String[] args) {
        int multiplication = 1;
        int count  = 0;
        for (int i = 2; i < 10; i++) {
            if (isEvenNumber(i)){
                multiplication = multiplication * i;
                count++;
                System.out.println(i + " is even number");

            }
            if (count==3){
                break;
            }
        }
        System.out.println(multiplication);
    }


    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
