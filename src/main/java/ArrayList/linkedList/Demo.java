package ArrayList.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "kraków");
        addInOrder(placesToVisit, "Siedlce");
        addInOrder(placesToVisit, "Poznan");
        addInOrder(placesToVisit, "Juszczyn");
        addInOrder(placesToVisit, "Gdynia");
        printList(placesToVisit);
;
    }

    private static void printList(LinkedList<String> linkedList) {
        ListIterator<String> i = linkedList.listIterator();
        while (i.hasNext()) {
            System.out.println("now visiting " + i.next());

        }
        System.out.println("------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;


    }
}
