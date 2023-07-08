package project7.models;

public class Worker implements Comparable<Worker>{

    private String name;
    private String surname;
    private String profession;
    private int salary;

    public Worker(String name, String surname, String profession, int salary) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.salary = salary;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.profession.compareTo(o.profession);
    }
}
