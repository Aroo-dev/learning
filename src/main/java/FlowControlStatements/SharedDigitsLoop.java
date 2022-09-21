package FlowControlStatements;

public class SharedDigitsLoop {
    public static void main(String[] args) {
        boolean sharedDigit = hasSharedDigit(23, 13);
        System.out.println(sharedDigit);


    }
public static boolean hasSharedDigit ( int x, int y){
        if ((x < 10) || (x > 99) || (y < 10) || (y > 99)){
            return false;
        }
        int firstDigitOfx =  x % 10;
        int firstDigitofY = y % 10;
        int secondDigitofx = x /10;
        int secondDigitofy = y/10;
    return (firstDigitOfx == firstDigitofY) || (firstDigitOfx == secondDigitofy)
            || (firstDigitofY == secondDigitofx || secondDigitofx == secondDigitofy);
}
}
//    Write a method named hasSharedDigit with two parameters of type int.
//
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//        If one of the numbers is not within the range, the method should return false.
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
//        otherwise, the method should return false.



