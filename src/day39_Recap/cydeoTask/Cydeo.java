package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("Hamit", 29, 'M', 11, "SDET", 25000);
        System.out.println(tester);
        tester.createTicket();
        tester.work();
        tester.eat();
        tester.drink();
        tester.sleep();

        System.out.println();

        Developer developer = new Developer("Betul", 27, 'F', 22, "Junior Developer", 28000);
        System.out.println(developer);
        developer.work();
        developer.fixingBugs();
        developer.setAge(25);
        System.out.println("Age: " + developer.getAge());
        System.out.println(developer);

        System.out.println();

        Teacher teacher = new Teacher("Leyla", 26, 'F', 33, "Math Teacher", 15000);
        System.out.println(teacher);
        teacher.work();

        System.out.println();

        Student student = new Student("Mesut", 34, 'M', 44, "QA");
        System.out.println(student);
        student.study();



    }

}

/*
7. Create a class named Cydeo:

        Create objects of Tester, Developer,Teacher, Student

        Test all the functions of each objects

        Analyze the relationships between the classes
 */