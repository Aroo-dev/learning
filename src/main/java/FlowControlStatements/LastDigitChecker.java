package FlowControlStatements;

public class LastDigitChecker {
    public static void main(String[] args) {
        boolean rightMostDigit = hasSameLastDigit(41, 22, 71);
        System.out.println(rightMostDigit);
    }

    public static boolean hasSameLastDigit (int x, int y, int z){
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000 ){
            return false;
        }
        int xc = x % 10;
        int yc = y % 10;
        int zc = z % 10;

        if (xc == yc || xc == zc || zc == yc ){
            return true;

        }
        return false;
    }
    public static boolean isValid ( int number){
        if (number < 10 || number > 1000){
            return false;
        } return true;
    }

}
