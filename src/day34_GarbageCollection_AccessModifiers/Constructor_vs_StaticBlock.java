package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static{                                     // static block use for initializing static variables
        System.out.println("Static Block");     // runs first before everything, only runs one time
    }

    public Constructor_vs_StaticBlock(){  // constructor you will use with instances
        System.out.println("constructor");
    }

    public static void main(String[] args) {

        new Constructor_vs_StaticBlock(); //1
        new Constructor_vs_StaticBlock(); //2
        new Constructor_vs_StaticBlock(); //3
        new Constructor_vs_StaticBlock(); //4
        new Constructor_vs_StaticBlock(); //5

    }

}
