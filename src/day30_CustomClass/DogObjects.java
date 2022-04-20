package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.colour = "White";

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 3;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.colour = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jenny", "German Shepard", 4, 'F', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");
        System.out.println(dog4);

        Dog dog5 = new Dog();
        dog5.setInfo("Balzac", "Golden", 6, 'M', "Large", "yellow");
        System.out.println(dog5);


        System.out.println("------------------------------------------------------------------------");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        for (Dog dog : dogs) {

            if (dog.gender == 'F'){
                femaleDogs.add(dog);
            }else {
                maleDogs.add(dog);
            }
        }

        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);






    }

}
