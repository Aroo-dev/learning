package FlowControlStatements;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int commonDivisor = greatestCommonDivisor(12, 30);
        System.out.println(commonDivisor);
    }
    public static int greatestCommonDivisor( int first, int second) {
        if ( first < 10 || second < 10){
            return -1;
        }
        int min = first > second ? first : second;
        int min2 = first;

        if(second > first) {
            min2 = second;
        }

        int commonDivisor = 0;
        for (int i = 1; i <min ; i++) {
            if ( first % i == 0 & second % i == 0 ){
                commonDivisor = i;
            }
        }
        return commonDivisor;

    }
}
