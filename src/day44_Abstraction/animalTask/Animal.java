package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreathe;

    static{
        canBreathe = true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if (!(gender == 'F' || gender == 'M')){
            throw new RuntimeException("Invalid Entry: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void eat();

    public final void drink(){
        System.out.println(name + " is drink water");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
