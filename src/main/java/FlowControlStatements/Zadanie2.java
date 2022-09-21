package FlowControlStatements;

public class Zadanie2 {

    public static void main(String[] args) {
       boolean value = shouldWakeUp(true, 8);
        System.out.println(value);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        var shouldwakeUp = true;
        if (((hourOfTheDay < 8 && hourOfTheDay >= 0) || (hourOfTheDay > 22 && hourOfTheDay < 24)) ) {
            return shouldwakeUp;
        } else{
            return false;

        }


    }
}

