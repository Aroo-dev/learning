package FlowControlStatements;

import java.util.stream.IntStream;

public class Mati {
    public static void main(String[] args) {

        int a = -3;
        int b = 2;

        IntStream.range(a, b+1).boxed().forEach(k -> System.out.println(k));

    }


}
