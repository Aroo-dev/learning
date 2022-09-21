package FlowControlStatements;

import java.util.Scanner;

public class MinAndMaxcChallenge {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int number;
        double average = 0;
        while (true) {

            Boolean hasanInt = scanner.hasNextInt();

            if (hasanInt) {
                number = scanner.nextInt();
                count++;
                sum = sum + number;
                average = sum / (double) count;
            } else {
                break;
            }
        }
        scanner.close();

        System.out.println("SUM = " + sum + " AVG = " + (average));
    }
}
