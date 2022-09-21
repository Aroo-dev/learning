package FlowControlStatements;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("input the number");
        int x = scanner.nextInt();
        System.out.println("input the second number");
        int y = scanner.nextInt();
        System.out.println("input the second number");
        int z =  scanner.nextInt();
        System.out.println("the average of these number is " + average(x, y,z) );

    }

    public static int average(int number1, int number2, int number3) {
        return (number1 + number2 + number3) / 3;

    }

}
