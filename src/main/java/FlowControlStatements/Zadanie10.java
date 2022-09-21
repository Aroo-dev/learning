package FlowControlStatements;

public class Zadanie10 {
    public static void main(String[] args) {
        printYearsAndDays(5616550);
    }

    public static void printYearsAndDays(long minutes) {

        long years = minutes / 525600;
        long days = (minutes % 525600) / 1440;
        if (minutes < 0) {
            System.out.println("invalid Value");

        } else {
            System.out.println(minutes + " = " + years + " years " + days + " days");

        }
    }
}
