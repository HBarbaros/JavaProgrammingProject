package day43_Abstraction.carTask;

public abstract class Car {

    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if (year < 1886 ){
            throw new RuntimeException("Invalid Year " + year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if (price <= 0){
            throw new RuntimeException("Invalid Price " + price);
        }

        this.price = price;
    }

    public abstract void start(); // if the start method different for all the car, but if the same then you can use just public void start(){method body here}

    public abstract void stop(); // if the start method different for all the car, but if the same then you can use just public void start(){method body here}

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= €" + price +
                '}';
    }
}
