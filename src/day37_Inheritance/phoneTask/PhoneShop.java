package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("13 Pro Max", "6.7 inches", 1500, "Black");
        System.out.println(iphone);
        iphone.facetime(458234);
        iphone.facetime("aaabbb@mail.com");
        iphone.call(548321);
        iphone.text(554548);

        System.out.println();

        Samsung samsung = new Samsung("galaxy s19", "6 inches", 1000, "White");
        System.out.println(samsung);
        samsung.freeze();

        System.out.println();

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");
        System.out.println(nokia);
        nokia.selfDefense();

        System.out.println();

        System.out.println(iphone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(nokia.hasBattery);



    }

}
