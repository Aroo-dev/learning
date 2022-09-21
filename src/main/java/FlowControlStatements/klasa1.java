package FlowControlStatements;

public class klasa1 {
    public static void main(String[] args) {

        int age = 13;
        if(age >=18) {
            System.out.println("pełnoletnia");
        }
        else if(age>=16) {
            System.out.println("możesz pracować");

        }
        else {
            System.out.println("nie mozesz pracowac");
        }

        String imie = age >= 18 ? "Bartek" : "Bartuś";
        System.out.println(imie);
    }

}
