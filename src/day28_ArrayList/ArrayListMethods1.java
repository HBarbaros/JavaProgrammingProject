package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // index 0
        numbers.add(20); // index 1
        numbers.add(30); // index 3
        numbers.add(40); // index 4
        numbers.add(50); // index 6
        numbers.add(60); // index 7

        numbers.add(2,25); // index 2
        numbers.add(5,45); // index 5
        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("--------------------------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java"); // index 2
        list.add("C#"); // index 3
        list.add("Ruby");

        list.set(2, "JavaScript"); // index 2 (new)
        list.set(3, "C++"); // index 3 (new)

        System.out.println(list);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Hulya");
        employees.add("Ali");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);

        boolean r1 = employees.remove("Ali");
        System.out.println(employees);

        boolean r2 = employees.remove("Neira");
        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);





    }


}
