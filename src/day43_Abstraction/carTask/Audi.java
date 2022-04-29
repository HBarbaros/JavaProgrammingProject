package day43_Abstraction.carTask;

public final class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start(){
        System.out.println("Press the start/stop button for start engine");
    }

    public void stop(){
        System.out.println("Press the start/stop button for shut down car");
    }

    public void autoPark(){
        System.out.println(getBrand() + " " + getModel() + " has auto park feature");
    }

}
