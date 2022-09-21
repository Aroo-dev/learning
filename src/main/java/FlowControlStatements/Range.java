package FlowControlStatements;

public class Range {
    public static void main(String[] args) {


        byte byteNumber = 13;
        int intNumber = 1553;
        short shortNumber = 143;
        long longNumber = 5000L + (shortNumber + intNumber + byteNumber) * 10;
        System.out.println(longNumber);
        short shortTotal = (short) (1000 + 10 * (byteNumber + intNumber));
        System.out.println(shortTotal);
//         float myFloatNumber = (float) 5.24 == 5.24f;
        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(kilograms);

        int resault = 3;
        resault *= 3;
        System.out.println(resault);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("its not an alien");
            System.out.println(" this line is still executed");
        }
        int topscore = 80;
        if (topscore < 100) {
            System.out.println("you got the high score ");

        }
        int secondtopScore = 81;
        if (topscore > secondtopScore && topscore < 100) {
            System.out.println("greather than top score and less than 100 ");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirddouble = (firstDouble + secondDouble) * 100;
        thirddouble = thirddouble % 40.00;
        System.out.println(thirddouble);
        boolean mytotalRemainder = (thirddouble == 0) ? true : false;
        if (!mytotalRemainder) {
            System.out.println("got some remainder");

            //expressions
        }


        double miles = 200;
        double kilometeres = miles * 1.609344;
        System.out.println(kilometeres);

    }
}

















