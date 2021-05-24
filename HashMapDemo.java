package com.DataStructures_And_Algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap =
                new HashMap<>();
        //adding elements
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);

        System.out.println("size of hashmap is:"+hashMap.size());
        //linked HashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        //adding elements
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("four", 4);

        //linked HashMap
        Map<String, Integer> treeMap = new TreeMap<>();
        //adding elements
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);
        treeMap.put("four", 4);


        //changing the value of key 3
//        hashMap.put("three", 3333);
//        System.out.println(hashMap);
//        System.out.println(hashMap.entrySet());


        //removing element
//        hashMap.remove("three");


        //iterating through the hash Map
//        System.out.println("Hash Map");
//     hashMap.forEach((value, key) -> {
//         System.out.print(key + ":");
//         System.out.println(value);
//     });

     //linked hashmap have order
//        System.out.println("Linked Hash Map");
//        linkedHashMap.forEach((value,key) ->{
//            System.out.print(key + ":");
//            System.out.println(value);
//        });


        //iterating through the tree map
        //want to clear tree Map??
//        treeMap.clear();
        //key is present in Map or Not
//        System.out.println(treeMap.containsKey("one"));

        //value  is
        System.out.println("Tree Map");
        treeMap.forEach((value, key) ->{
            System.out.print(key + ":");
            System.out.println(value);
        });
     //characteristics of a Map interface
        //A map cannot contain duplicate keys
    }
}
