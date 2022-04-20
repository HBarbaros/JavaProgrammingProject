package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Lucy", "Husky", 'F', 2, "Medium", "White");
        System.out.println(dog);
        dog.sleep();
        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();
        //dog.hunt();
        //dog.scratch();

        System.out.println();

        Cat cat = new Cat();
        cat.setInfo("Minnos", "British", 'M', 1, "Small", "Brown");
        System.out.println(cat);
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();

        System.out.println();


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");
        System.out.println(tiger);
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();


    }

}
