package ArrayList.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("tim");
        ArrayList<Integer> intArrayList =  new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());


        }
        ArrayList<Double> myDoubleValues =  new ArrayList<>();
        for (double i = 0; i < 10; i+= 0.5) {
           myDoubleValues.add(Double.valueOf(i));
            for (int j = 0; j < myDoubleValues.size(); j++) {
                double value  = myDoubleValues.get(j).doubleValue();
                System.out.println(j + " ---> " + value);

            }
        }




        }
    }

