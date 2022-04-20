package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNum = scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state");
        String stateName = scan.next();

        System.out.println("Enter your zip code");
        String zipCode = scan.next();

        scan.nextLine(); //EnterEnter

        System.out.println("Enter your country name");
        String countryName = scan.nextLine();

        scan.close();

        System.out.println(fullName + "\n" + buildingNum + " " + streetName + "\n" + cityName +", " + stateName + " " + zipCode);



    }


}
/*
1.Enter your full name ( nextLine() )
2.Enter your building number ( next() )
3.Enter your street name ( nextLine() )
4.Enter your city name ( nextLine() )
5.Enter your state ( next() )
6.Enter your zip code ( next() )

Display the shipping address
 */