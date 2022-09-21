package FlowControlStatements;

public class Zadanie4 {
    public static void main(String[] args) {
     boolean letssee = hasEqualSum(2,3,5);
        System.out.println(letssee);
    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue){

        if (firstValue + secondValue == thirdValue) {

            return true;
        }

                return false;



    }
}
