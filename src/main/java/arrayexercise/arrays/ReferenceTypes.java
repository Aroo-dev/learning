package arrayexercise.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReferenceTypes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
        int returnedMax =  findMax(returnedArray);
        System.out.println(" max = " +  returnedMax);

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }

        return min;
    }
    private static int findMax(int[] array){
        int max =  array[0];
        for (int i = 0; i <array.length  ; i++) {
             int value  = array[i];
            if(max < value){
                max = value;
            }

        }
        return max;
    }
}

