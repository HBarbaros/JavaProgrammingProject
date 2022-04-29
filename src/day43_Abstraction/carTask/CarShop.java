package day43_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        // Car car1 = new Car("Cydeo",  "CYD", "Blue", 2022, 100000);  // Car' is abstract; cannot be instantiated  // Araba soyuttur somutlastirilamaz
        // We can not create object from Abstract class, because is not concrete(somut)

        Honda honda = new Honda("Accord", "Black", 2019, 30000);
        honda.start();
        honda.stop();

        System.out.println();

        Audi audi = new Audi("A6", "Pink", 2022, 50000);
        audi.start();
        audi.stop();

        System.out.println();

        Tesla tesla = new Tesla("Model S", "White", 2022, 80000);
        tesla.start();
        tesla.stop();

        System.out.println();

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("Red");
        audi.setColor("Gray");
        tesla.setColor("Green");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);





    }

}
