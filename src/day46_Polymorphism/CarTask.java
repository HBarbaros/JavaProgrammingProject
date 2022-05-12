package day46_Polymorphism;

import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;
import java.util.ArrayList;

public class CarTask {

    public static void main(String[] args) {
        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };

        ArrayList<Car> eligibleForRecall = new ArrayList<>();

        for (Car car : cars) {
            if ((car.brand.equals("Toyota") && car.year >= 2010 && car.year <= 2011) || (car.brand.equals("BMW") && car.year >= 1929 && car.year <= 2022)
                    || (car.brand.equals("Tesla") && car.year >= 2015 && car.year <= 2016)) {
                eligibleForRecall.add(car);
            }

        }

        System.out.println("eligibleForRecall = " + eligibleForRecall);

        System.out.println("-------------------------------------------------------------------------------");

        //1.2 Write a program that can display the car that has the highest mileage
        //1.3 Write a program that can display the car that has the lowest mileage

        Car carWithHighestMileage = cars[0],
                carWithLowesMileage = cars[0];

        for (Car eachCar : cars) {
            if (eachCar.miles > carWithHighestMileage.miles){
                carWithHighestMileage = eachCar;
            }

            if (eachCar.miles < carWithLowesMileage.miles){
                carWithLowesMileage = eachCar;
            }

        }

        System.out.println(carWithHighestMileage);
        System.out.println(carWithLowesMileage);
    }
}
