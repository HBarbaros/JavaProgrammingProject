package day36_Inheritance.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Kubra", 'F', 34, "QA", 1234, 25000, "Microsoft");
        tester.test();
        System.out.println(tester);

        System.out.println();


        Developer developer = new Developer();
        developer.setInfo("Burak", 'M', 44, "SE", 3214, 50000, "Apple");
        developer.develop();
        System.out.println(developer);

        System.out.println();

        Driver driver = new Driver();
        driver.setInfo("John", 'M', 55, "Driver", 4597, 30000, "Stockholm");
        driver.driver();
        System.out.println(driver);

        System.out.println();

        Teacher teacher = new Teacher();
        teacher.setInfo("Rosa", 'F', 33, "Math", 6582, 24000, "Flowers");
        teacher.teacher();
        System.out.println(teacher);






    }

}
