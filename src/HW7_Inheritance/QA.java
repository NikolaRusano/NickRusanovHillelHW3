package HW7_Inheritance;

public class QA extends Employee {
    String level, projectName, nameManager;
    int experienceAge;

    public QA(int id, String name, int age, double salary,
              String male, Address address, String level,
              String projectName, String nameManager, int experienceAge) {
        super(id, name, age, salary, male, address);
        this.level = level;
        this.projectName = projectName;
        this.nameManager = nameManager;
        this.experienceAge = experienceAge;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public int getExperienceAge() {
        return experienceAge;
    }

    public void setExperienceAge(int experienceAge) {
        this.experienceAge = experienceAge;
    }

    @Override
    public String getJobDescriptions() {
        return jobDescriptions;
    }

    @Override
    public void setJobDescriptions() {
        jobDescriptions = "Test as accurate as possible all modules";
    }


    @Override
    public double getSalaryBonus() {
        return salaryBonus + 50;
    }

    @Override
    public void setSalaryBonus() {
        salaryBonus = salary*0.7;

    }

    @Override
    public long getDailyTime() {
        return dailyTime;
    }

    @Override
    public void setDailyTime() {
        dailyTime = 6;
    }

    public QA(int id, String name, int age, double salary, String male, Address address) {
        super(id, name, age, salary, male, address);
    }
}
