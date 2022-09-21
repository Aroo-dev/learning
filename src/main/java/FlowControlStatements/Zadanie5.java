package FlowControlStatements;

public class Zadanie5 {
    public static void main(String[] args) {
    boolean age = hasTeen(22,15,13);
        System.out.println(age);
    }

    public static boolean hasTeen(int firstPerson, int secondPerson, int thirdPerson) {
        if (firstPerson >= 13 && firstPerson <= 19 || secondPerson >= 13 && firstPerson <= 19 || thirdPerson >= 13 && firstPerson <= 19 ) {
            return true;
        } else if (secondPerson >= 13 && secondPerson <= 19) {
            return true;
        } else if (thirdPerson >= 13 && thirdPerson <= 19) {
            return true;

        }else return false;



    }
}

