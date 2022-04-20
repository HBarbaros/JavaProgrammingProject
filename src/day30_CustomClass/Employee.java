package day30_CustomClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){

        System.out.println(jobTitle + " " + name + " is working");

    }

}

/*
Employee Class:

		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)

		Actions:
			toString(): to be bale to print each employee object
			setInfo(): to be able to set all the attributes
			work()...


 */