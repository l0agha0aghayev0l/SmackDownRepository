package project6;

public class Human {
    private String name;
    private String surname;
    private int age;
    private static boolean status;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static boolean isStatus() {
        return status;
    }

    public static void setStatus(boolean status) {
        Human.status = status;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age + " status=" + status +
                '}';
    }
}
