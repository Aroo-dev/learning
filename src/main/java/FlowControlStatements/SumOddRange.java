package FlowControlStatements;

public class SumOddRange {
    public static void main(String[] args) {
        sumOdd(2, 7);


    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return false;

        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        if (end <= start && start < 0 && end < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            if (isOdd(i));{
                return i;
            }


        }
        return 0;
    }
}