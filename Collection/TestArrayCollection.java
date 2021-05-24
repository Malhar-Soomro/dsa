package com.DataStructures_And_Algorithms.Collection;

import java.util.Iterator;

public class TestArrayCollection {
    public static void main(String[] args) {
//        Array_Collection array_collection = new Array_Collection();
//        array_collection.add("malhar");
//        array_collection.add("Soomro");
//        String[] myString = {"Asad", "Ali", "Soomro"};
//        for(int i = 0; i < myString.length; i++){
//            array_collection.add(myString[i]);
//        }
//        array_collection.remove("malhar");
//        System.out.println(array_collection.size());
//        System.out.println(array_collection.isEmpty());

//        System.out.println(array_collection);

//        Iterator<Object> iterator = array_collection.iterator();
//        iterator.next();
//        iterator.remove();
//        System.out.println(array_collection);


        Array_Collection array_collection1 = new Array_Collection();
//        String[] animals = {"Monkey", "Lion", "Elephant", "Beast"};
        String[] animals = {"Monkey"};
        for(int i = 0; i < animals.length; i++){
            array_collection1.add(animals[i]);
        }
        Iterator<Object> iterator = array_collection1.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());





    }

}
