package FlowControlStatements;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
    printDayOftheWeek(9);
    printDayOftheWeek(1);
    printDayOftheWeek(2);
    printDayOftheWeek(4);
    printDayOftheWeek(3);
    printDayOftheWeek(6);
    printDayOftheWeek(5 );
    }
        String name = "Susan";

    public String getName() {
        return name;
    }

    public static void printDayOftheWeek (int day){

        switch (day){
            case 0:
                System.out.println("poniedziałek");
                break;
            case 1:
            System.out.println("wtorek");
                break;
             case 2:
            System.out.println("sroda");
                break;
                case 3:
            System.out.println("czwartek");
                break;
                case 4:
            System.out.println("piatek");
                break;
            case 5:
                System.out.println("sobota");
                break;
            case 6:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
