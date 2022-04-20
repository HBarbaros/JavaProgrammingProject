package day32_Constructor;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Audi");
        Car car2 = new Car("BMW", "320i");
        Car car3 = new Car("Mercedes", "E250", 2020);
        Car car4 = new Car("Volkswagen", "Passat", 2021, 25500);
        Car car5 = new Car("Porsche", "911", 1998, 100500, "Blue");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);



    }

}
