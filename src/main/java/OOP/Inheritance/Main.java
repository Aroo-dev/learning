package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals("Animal",1,1,23,34);
        Dog dog = new Dog("Drago",1,1,2,4,22,20,"long silky");
        dog.eat();
//        dog.walk();
        dog.run();


    }
}
