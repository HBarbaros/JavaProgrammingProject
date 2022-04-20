package day30_CustomClass;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Ali", 33, 'M', 98873, "Securtiy", 30000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Halil", 23, 'M', 83726, "Developer", 10000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Anna", 28, 'F', 73728, "Manager", 70000, false);

        Employee employee4 = new Employee();
        employee4.setInfo("Lina",55,'F',2290,"Manager",80000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Kevin",32,'M',2298,"Senior QA", 110000,false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {

            if (employee.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }
            if (employee.salary > max){
                max = employee.salary;
            }
            if (employee.salary < min){
                min = employee.salary;
            }

        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

}

/*
CapitalOne Class:

	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */