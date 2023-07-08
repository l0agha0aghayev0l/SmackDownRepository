package project1;

public class Animal {

    private String name;
    private String color;
    private int age;
    private String country;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this(name);
        this.age= age;
    }
    public Animal(String name, String color, int age) {
        this(name, age);
        this.color = color;
    }

    public Animal(String name, String color, int age, String country) {
        this(name, color, age);
        this.country = country;
    }

    void makeSound(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
    }


}
