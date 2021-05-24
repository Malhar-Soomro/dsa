package com.DataStructures_And_Algorithms.HashMap;



public class Country {
    public String name;
    public String language;
    public String isoKey;
    public int area;
    public int population;

    public Country(String name, String language, String isoKey, int area, int population) {
        this.name = name;
        this.language = language;
        this.isoKey = isoKey;
        this.area = area;
        this.population = population;
    }

    public String toString(){
        return "("+name+","+language+","+isoKey+","+area+","+population+")";
    }

    public static void main(String[] args) {
        Country []countries = new Country[10];
        Country pak = new Country("Pakistan","Urdu","pk",12000,232323);
        Country ind = new Country("India","hindi","in",43000000,450000000);
        countries[0]  = new Country("Pakistan","Urdu","pk",12000,232323);
        System.out.println(countries[0]);
    }
}
