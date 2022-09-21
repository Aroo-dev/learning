package FlowControlStatements;

import org.w3c.dom.ls.LSOutput;

public class FactorPrinter {
    public static void main(String[] args) {
        int x = 4;
//        int y = 5;
//        if (x <  y){
//            System.out.println(y);
//        } else{
//            System.out.println(x);

        int fraction = 1;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                fraction = fraction * i;
            }
            System.out.println(fraction);

        }
    }
}
