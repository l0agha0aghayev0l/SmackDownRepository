package project9.models;

public class Worker {

    private int id;
    private String name;
    private String profession;
    private int experience;
    private int salary;

    public Worker(int id, String name, String profession, int experience, int salary) {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.experience = experience;
        this.salary = salary;
    }

    public Worker(int id, String name, String profession, int experience) {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
