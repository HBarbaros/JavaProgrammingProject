package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber, groupNumber;
    public String fieldOdStudy;

    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOdStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOdStudy = fieldOdStudy;
    }

    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School name is " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret Code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attended class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOdStudy='" + fieldOdStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}

/*
    2. create a class named CydeoStudent

        Variables:
            name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

    Add a constructor to initialize all the fields
    Add a static block to initialize all the statics

        methods:
            printSchoolName();
            printSecretCode();
            attendClass():
            study()
            toString()
 */