package FlowControlStatements;

public class forLoopIsOdd {
    public static void main(String[] args) {

    }
    public static boolean isOdd (int value){
        if (value < 0){
            return false;
        }
        if(value % 2 !=0){
            return true;
        }
        return false;

    }
    public static int isOdd(int start, int end){
        int sum = 0;
        if ((start >= end) || (start < 0) || (end < 0)){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(start)){
                sum = sum + i;
            }
        }
        return sum;
    }
}
