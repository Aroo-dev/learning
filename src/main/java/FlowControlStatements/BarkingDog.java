package FlowControlStatements;

public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if (((hourOfTheDay < 8 && hourOfTheDay >= 0) || (hourOfTheDay > 22 && hourOfTheDay < 24)) && barking) {
            return true;
        }

        return false;

    }


}







