package project9.models;

public class Director {

    private String name;
    private String professionPermission;
    private int experiencePermission;
    private int salaryPermission;

    public Director(String name, String professionPermission, int experiencePermission, int salaryPermission) {
        this.name = name;
        this.professionPermission = professionPermission;
        this.experiencePermission = experiencePermission;
        this.salaryPermission = salaryPermission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessionPermission() {
        return professionPermission;
    }

    public void setProfessionPermission(String professionPermission) {
        this.professionPermission = professionPermission;
    }

    public int getExperiencePermission() {
        return experiencePermission;
    }

    public void setExperiencePermission(int experiencePermission) {
        this.experiencePermission = experiencePermission;
    }

    public int getSalaryPermission() {
        return salaryPermission;
    }

    public void setSalaryPermission(int salaryPermission) {
        this.salaryPermission = salaryPermission;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", professionPermission='" + professionPermission + '\'' +
                ", experiencePermission=" + experiencePermission +
                ", salaryPermission=" + salaryPermission +
                '}';
    }

    public boolean acceptingWorker(Worker worker){
        if (this.professionPermission.equalsIgnoreCase(worker.getProfession())){
            if (this.experiencePermission <= worker.getExperience()){
                if (this.salaryPermission >= worker.getSalary()){
                    return true;
                }
            }
        }
        return false;
    }
}
