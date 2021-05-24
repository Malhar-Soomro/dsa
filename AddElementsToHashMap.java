package com.DataStructures_And_Algorithms;

import java.util.HashMap;

public class AddElementsToHashMap {
    public static void main(String[] args) {
        var hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.forEach((value, key) ->{
            System.out.print(value);
        });
    }
}
