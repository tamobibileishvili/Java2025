package Seminar2;

public class Dog extends Animal implements AnimalInterface {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public void makeAnimalSound() {
        System.out.println("Bark");
    }
}
