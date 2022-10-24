package arrayexercise.arrays;

import java.util.Scanner;

public class Tablice {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("element " + i + " typed value was " + myIntegers[i]);

        }
        System.out.println("the average of summed parts of arrays is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values  \r");
        int value[] = new int[number];

        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();

        }
        return value;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return (double) sum / (double) array.length;
    }
}
