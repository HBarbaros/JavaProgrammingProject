package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //  Key    , Value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet"); // same key (5) can not be duplicated but same value kan duplicated.
        hashMap.put(5, "Isabella"); // same key (5) can not be duplicated but same value kan duplicated.
        hashMap.put(6, "Ahmet");
        hashMap.put(7, "Ahmet");
        hashMap.put(8, "Ahmet");
        hashMap.put(null, "Emre");
        hashMap.put(null, "Cihad");
        hashMap.put(null, "Hulya");
        hashMap.put(null, null );
        hashMap.put(null, null );
        hashMap.put(9, null );

        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5, "Isabella");
        //treeMap.put(null, "Hulya"); // TreeMap does not accept null key

        System.out.println("treeMap = " + treeMap);


        Map<Integer, String> hashtable = new Hashtable<>(); // Key and value can not be null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5, "Isabella");
        //hashtable.put(null, "Hulya");  // Hashtable does not accept null key

        System.out.println("hashtable = " + hashtable);

        //String str = null;
        //System.out.println(str.toUpperCase()); // NullPointerException


    }

}

/*
browser chrome
url
username cydeo
password cydeo123
 */