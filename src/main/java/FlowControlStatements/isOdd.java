package FlowControlStatements;

public class isOdd {
    public static void main(String[] args) {
      int h = sumOdd(2, 7);
        System.out.println(h);
    }

    public static boolean isOdd(int number){
        if (number < 0 ){
            return false;
        }
        if (number % 2  != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if (end <= start || start < 0){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end ; i++) {
          if (isOdd(i)){
              System.out.println("odd number is " + i);
              sum = sum + i;
          }

        }
        return sum;

    }
}
