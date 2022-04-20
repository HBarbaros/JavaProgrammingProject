package day25_CusomMethod_Overloading;

import Utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(array1);

        System.out.println("---------------------------------------");

        double[] array2 = {5.5, 6.6, 2.3, 5.7,};
        ArraysUtility.printEachElement(array2);

        System.out.println("---------------------------------------");

        char[] array3 = {'A', 'B', 'C', 'D', 'E'};
        ArraysUtility.printEachElement(array3);

        System.out.println("---------------------------------------");

        String[] array4 = {"Java", "Programming", "Language"};
        ArraysUtility.printEachElement(array4);

        System.out.println("---------------------------------------");

        int[] array5 = {5,6,7,8,9,4,3,2,};
        int max1 = ArraysUtility.max(array5);
        System.out.println("max1 = " + max1);

        System.out.println("---------------------------------------");

        double[] array6 = {3.4, 5.6, 9.5, 1.4, 2.5, 7.7};
        double max2 = ArraysUtility.max(array6);
        System.out.println("max2 = " + max2);

        System.out.println("---------------------------------------");

        int[] a1 = {1,2,3,4,5,6};
        boolean r1 =ArraysUtility.contains(a1, 5);
        System.out.println("r1 = " + r1);

        System.out.println("---------------------------------------");

        double[] a2 = {2.3, 3.4, 5.6, 6.7, 8.9};
        boolean r2 = ArraysUtility.contains(a2, 5.5);
        System.out.println("r2 = " + r2);

        System.out.println("---------------------------------------");

        char[] a3 = {'A', 'B', 'C', 'D', 'E'};
        boolean r3 = ArraysUtility.contains(a3, 'F');
        System.out.println("r3 = " + r3);

        System.out.println("---------------------------------------");

        String[] a4 = {"Java", "Programming", "Language"};
        boolean r4 = ArraysUtility.contains(a4, "Java");
        System.out.println("r4 = " + r4);






    }

}
