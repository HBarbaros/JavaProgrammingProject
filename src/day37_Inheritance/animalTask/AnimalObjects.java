package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog = new Dog("Alex", "Husky", 'M', 3, "Medium", "White");
        System.out.println(dog);
        dog.bark();

        Cat cat = new Cat("Love", "Siamese", 'F', 2, "Large", "Black");
        System.out.println(cat);
        cat.scratch();

        Parrot parrot = new Parrot("King", "Macaw", 'M', 3, "Small", "Blue", "Green");
        System.out.println(parrot);
        parrot.sing();


    }

}
