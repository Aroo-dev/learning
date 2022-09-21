package FlowControlStatements;

public class InputCalculator {
    public static void main(String[] args) {
        boolean sum = canPack(2,10 , 18);
        System.out.println(sum);
    }


    //If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
//    For example, if goal = 9, bigCount = 2, and smallCount = 0,
//    the method should return false since each big bag is 5 kilos and cannot be divided.
//        However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true
//    because of 1 full bigCount bag and 4 full smallCount bags equal goal, and
//    it's okay if there are additional bags left over.
    public static boolean canPack(int bigCount, int smallCount, int goal) {
       if (goal < 0 ){
           return false;
       }
        if (bigCount < 0 || smallCount < 0) {

            return false;
        }

        if (bigCount * 5 + smallCount == goal) {
            return true;
        } else if (bigCount * 5 + smallCount < goal) {
            return false;
        } else {
            int sum = bigCount * 5;
            while (sum >= goal && bigCount > 0) {
                sum = sum - 5;
                bigCount--;
            }
            return sum + smallCount >= goal;


        }
    }
}

