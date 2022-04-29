package day43_Abstraction.carTask;

public final class Honda extends Car {

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    public void start(){
        System.out.println("Twist the key to ignition");
    }

    public void stop(){
        System.out.println("Take out the key to shut the car");
    }

}