package project7.models;

public class User implements Comparable<User>{
    private String username;
    private String name;
    private String surname;
    private int age;
    private String nationality;

    public User(String username, String name, String surname, int age, String nationality) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.username.compareTo(o.username);
    }
}
