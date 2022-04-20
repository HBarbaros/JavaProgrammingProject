package day36_Inheritance.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {

        Student student = new Student("Daniel", 29, 'M', 'D', "MIT");
        student.setAge(39);
        System.out.println(student);
        student.study();

    }

}
