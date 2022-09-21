package FlowControlStatements;

public class CheckNumber {
    public static void main(String[] args) {

        checkNumber(0);

    }

    public static void checkNumber (int number) {
        int zero = 0;
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");

        }
        else{
            System.out.println("zero");
        }

    }


}
