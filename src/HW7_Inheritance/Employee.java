package HW7_Inheritance;

abstract class Employee{
        int id;
        String name;
        int age;
        double salary;
        String male;
        Address address;//Address is class

        String jobDescriptions;
        double salaryBonus;
        long dailyTime;

        public abstract String getJobDescriptions();
        public abstract void setJobDescriptions();
        public abstract double getSalaryBonus();
        public abstract void setSalaryBonus();
        public abstract long getDailyTime();
        public abstract void setDailyTime();



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

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public String getMale() {
                return male;
        }

        public void setMale(String male) {
                this.male = male;
        }

        public Address getAddress() {
                return address;
        }

        public void setAddress(Address address) {
                this.address = address;
        }



        public Employee(int id, String name, int age, double salary, String male, Address address) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.salary = salary;
                this.male = male;
                this.address = address;
        }
}


