package arrayexercise.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      int [] myIntegers = getIntegers(5);
        int [] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);
//      double average = getAverage(myIntegers);
//        System.out.println(average);

        }
        public static void printArray(int[] array){
            for (int i = 0; i <array.length ; i++) {
                System.out.println("element " + i + " value is " + array[i]);

            }

        }
        public static int[] sortIntegers(int[] array){

       int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
            while (flag){
                flag = false;
                for (int i = 0; i < array.length -1 ; i++) {
                    int temp = array[i];
                    if (array[i]> array[i+1]){
                        array[i] = array[i + 1];
                        array[i+ 1] =  temp;
                        flag = true;
                    }

                }

            }
             return array;
        }
        private static int[] getIntegers(int number){
            System.out.println("Enter " + number + " positive Integers: \r");
         int[] value  = new int[number];
            for (int i = 0; i <number ; i++) {
                value[i] = scanner.nextInt();

            }
            return value;
    }
    public static double getAverage(int[] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum  += array[i];

        }
        return (double) sum / array.length;
    }


    }
