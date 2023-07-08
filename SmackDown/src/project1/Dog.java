package project1;

public class Dog extends Animal implements AnimalSound{

    String poroda;

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }


    @Override
    void makeSound() {
        System.out.println("WOOF");
    }

    @Override
    public void makeNoise() {
        System.out.println("I'm Dog");
    }
}
