package FlowControlStatements;

public class ParzysteIndeksy {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 7, 6, 3, 6, 9, 1, 2};



// wydrukuj sume cyfr parzystych

        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {

                sum += +number;
                System.out.println(" the number is " + number);
            }

        }
//                i - indeks
//                        numbers[i]

                System.out.println(sum);

        }





        }



