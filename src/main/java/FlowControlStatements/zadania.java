package FlowControlStatements;

public class zadania {
    public static void main(String[] args) {
        int sum = getEvenDigitSum(13362);
        System.out.println(sum);
    }
    public static int getEvenDigitSum ( int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        int i = number;

        for (;i!=0;) {
            int digit = i % 10;
            if (digit % 2 == 0){
                sum += digit;
            }

            i = i / 10;
        }
//        while (number != 0){
//            int digit = number % 10;
//            if (digit % 2 == 0){
//
//                sum += digit;
//            }
//            number  =  number /10;
//
//        }
        return sum;
    }
}

//    Write a method named getEvenDigitSum with one parameter of type int called number.
//    The method should return the sum of the even digits within the number.
//    If the number is negative, the method should return -1 to indicate an invalid value.


