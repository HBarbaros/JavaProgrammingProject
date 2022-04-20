package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee employee1 = new Employee("David");
        Employee employee2 = new Employee("Yuliya", 'F');
        Employee employee3 = new Employee("Johan", 'M', "Developer");
        Employee employee4 = new Employee("Aleksandra", 'F', "SDET", 50000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);



    }

}
