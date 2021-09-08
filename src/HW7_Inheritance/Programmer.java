package HW7_Inheritance;

import java.util.Scanner;

public class Programmer extends Employee{
    String codingLanguage, programmingLevel, teamLeadManager;
    int codingExperienceYears;
    int quantityKnownOS;
    int getQuantityKnownLanguages;
    Scanner scanner = new Scanner(System.in);

    public String getCodingLanguage() {
        return codingLanguage;
    }

    public void setCodingLanguage(String codingLanguage) {
        this.codingLanguage = codingLanguage;
    }

    public String getProgrammingLevel() {
        return programmingLevel;
    }

    public void setProgrammingLevel(String programmingLevel) {
        this.programmingLevel = programmingLevel;
    }

    public String getTeamLeadManager() {
        return teamLeadManager;
    }

    public void setTeamLeadManager(String teamLeadManager) {
        this.teamLeadManager = teamLeadManager;
    }

    public int getCodingExperienceYears() {
        return codingExperienceYears;
    }

    public void setCodingExperienceYears(int codingExperienceYears) {
        this.codingExperienceYears = codingExperienceYears;
    }

    public int getQuantityKnownOS() {
        return quantityKnownOS;
    }

    public void setQuantityKnownOS(int quantityKnownOS) {
        this.quantityKnownOS = quantityKnownOS;
    }

    public int getGetQuantityKnownLanguages() {
        return getQuantityKnownLanguages;
    }

    public void setGetQuantityKnownLanguages(int getQuantityKnownLanguages) {
        this.getQuantityKnownLanguages = getQuantityKnownLanguages;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Programmer(int id, String name, int age, double salary,
                      String male, Address address, String codingLanguage,
                      String programmingLevel, String teamLeadManager,
                      int codingExperienceYears, int quantityKnownOS, int getQuantityKnownLanguages) {
        super(id, name, age, salary, male, address);
        this.codingLanguage = codingLanguage;
        this.programmingLevel = programmingLevel;
        this.teamLeadManager = teamLeadManager;
        this.codingExperienceYears = codingExperienceYears;
        this.quantityKnownOS = quantityKnownOS;
        this.getQuantityKnownLanguages = getQuantityKnownLanguages;
    }

    @Override
    public String getJobDescriptions() {

        return jobDescriptions + "clean work place";
    }

    @Override
    public void setJobDescriptions() {
        jobDescriptions = "Work gard and write code clearly";
    }

    @Override
    public double getSalaryBonus() {
        return salaryBonus;
    }

    @Override
    public void setSalaryBonus() {
        salaryBonus = salary*0.30;
    }

    @Override
    public long getDailyTime() {
        return dailyTime;
    }

    @Override
    public void setDailyTime() {
        dailyTime = 9;
    }

    public Programmer(int id, String name, int age, double salary, String male, Address address) {
        super(id, name, age, salary, male, address);
    }
}
