package FlowControlStatements;

import java.util.Scanner;

public class Dnitygodnia {
    public static void main(String[] args) {
        String[] dnitygodnia = new String[]{"pn", "wt","sr","czw","pt", "sb","nie"};



        Scanner scanner = new Scanner(System.in);
        System.out.println("jaki jest dzien tygodnia");
        int a = scanner.nextInt();
//        for (int i = b; i < dnitygodnia.length; i++) {
//            System.out.println(dnitygodnia);

        System.out.println(dnitygodnia[a - 1]);

        }

    }
//}
