package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Corolla", 2020, 20000, "Gray", 12345);

        Tesla tesla = new Tesla("Model S", 2021, 50000, "Blue", 1252);

        BMW bmw = new BMW("M5", 2021, 60000, "Black", 14582);

        toyota.start();
        tesla.start();
        bmw.start();

        System.out.println(toyota);
        System.out.println(tesla);
        System.out.println(bmw);


    }

}
