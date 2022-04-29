package day43_Abstraction.carTask;

public final class Tesla extends Car{

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" for start car engine");
    }

    @Override
    public void stop() {
        System.out.println("Say \"Stop\" for shut car engine");
    }

    public void autoPilot(){
        System.out.println(getBrand() + " " + getModel() + " has auto pilot feature");
    }

}
