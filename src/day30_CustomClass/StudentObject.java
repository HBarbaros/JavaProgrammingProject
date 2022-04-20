package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Barbaros", 'M', 23, 12345, 'C');

        Student student2 = new Student();
        student2.setInfo("Ukba", 'F', 23, 12333, 'A');

        Student student3 = new Student();
        student3.setInfo("Zeynep", 'F', 28, 54091, 'B');

        Student student4 = new Student();
        student4.setInfo("Bilal", 'M', 33, 77561, 'B');

        Student student5 = new Student();
        student5.setInfo("Fatma", 'F', 50, 34501, 'A');

        Student student6 = new Student();
        student6.setInfo("Mehmet", 'M', 60, 98736, 'A');

        Student[] students = {student1, student2, student3, student4, student5, student6};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>(); //

        for (Student student : students) {

            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);

    }

}
