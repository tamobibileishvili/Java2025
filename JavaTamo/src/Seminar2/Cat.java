package Seminar2;

public class Cat extends Animal implements AnimalInterface {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void makeAnimalSound() {
        System.out.println("Meow");
    }
}
