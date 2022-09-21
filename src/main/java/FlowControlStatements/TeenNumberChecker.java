package FlowControlStatements;

public class TeenNumberChecker {
        public static boolean hasTeen(int firstPerson, int secondPerson, int thirdPerson) {
            if (firstPerson >= 13 && firstPerson <= 19 ||
                    secondPerson >= 13 && secondPerson <= 19 ||
                    thirdPerson >= 13 && thirdPerson <= 19 ) {
                return true;

            }
            return false;
        }
        public static boolean isTeen(int person1){
            if(person1 >= 13 && person1 <= 19){
                return true;
            }
            return false;
        }




    }