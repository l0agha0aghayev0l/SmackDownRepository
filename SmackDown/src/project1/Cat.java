package project1;

public class Cat extends Animal implements AnimalSound{

    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void makeNoise() {
        System.out.println("I'm Cat");
    }
}
