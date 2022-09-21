package FlowControlStatements;

public class ZadankoWc3 {
    public static void main(String[] args) {
    boolean equal = areEqualByThreeDecimalPlaces(3.1746, 3.26333);
        System.out.println(equal);

    }
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        int number = (int) firstValue / 1;
        int number2 = (int) secondValue * 1;
        if (number2 == number){
            return true;
        }
        return false;
    }

}