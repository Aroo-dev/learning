package arrayexercise.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter 6 positive numbers: ");

        int[] count  = readIntegers(6);

        System.out.println(Arrays.toString(count));
        int min  = findMin(count);
        System.out.println(min);

    }
    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i <count ; i++) {
            System.out.println("enter the number: ");
            array[i] = scanner.nextInt();

        }
        return array;

    }
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        int temp;
        for (int i = 0; i <array.length ; i++) {
            temp = array[i];
            if (min> temp ){
                min = temp;
            }

        }
        return min;
    }
}
