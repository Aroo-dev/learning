package FlowControlStatements;

import java.util.Random;
import java.util.Scanner;

public class Game
{

    public static void main(String[] args) {
        int  i = 0;
        int los;
        int odp;


        Random rnd = new Random();
        los = rnd.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę od 1 do 10");
        do {
            i++;
            System.out.println("Podaj liczbę");
            odp = scanner.nextInt();
            if (odp > los){
                System.out.println(" Przykro mi. Moja liczba jest mniejsza");
            }
            else if (odp < los) {
                System.out.println("Przykro mi. Moja liczba jest wieksza");

            }

        }while (odp != los);
        System.out.println("gratulacje, wygrales za " + i + " razem!");
        if (i <= 3) {
            System.out.println("Jestes dobry");
        }
        else {
            System.out.println("jestes slaby");
        }
    }
}