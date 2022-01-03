package com.DataStructures_And_Algorithms.HashMap;
public class HashTable implements MyMap {

    private Entry[] entries; // for storing records of table
    private int size, used;
    private final Entry NIL = new Entry(null, null);
    private final float loadFactor;

    public HashTable(int capacity, float loadFactor){
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }

    public HashTable(int capacity){
        this(capacity, 0.75f);
    }
    public HashTable(){
        this(11);
    }

    private static class Entry {
        Object key, value;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    // for generating valid keys using hashCode
    public int hash(Object key) {
//        System.out.println("index of "+key+" is:"+ ((key.hashCode() & 0x7FFFFFFF) % entries.length));
        if(key == null) throw new IllegalStateException("Key is empty");
        return ((key.hashCode() & 0x7FFFFFFF) % entries.length);
    }

    public Object get(Object key) {
        int h = hash(key);
        for(int i=0; i < entries.length; i++){
            int j= linearProbe(h, i);
            Entry entry = entries[j];
            if(entry == null) break;
            if(entry == NIL) continue;
            if(entry.key.equals(key)){
                return entry.value;
            }
        }

        return "value not found";
    }

    public Object put(Object key, Object value) {
        if(used > loadFactor*entries.length) reHash();
        int h = hash(key);
        for (int i = 0; i < entries.length; i++) {
            int j = linearProbe(h,i);  //finding next empty place to put our data  !!Linear Probing!!
            Entry entry = entries[j];
            if (entry == null || entry == NIL) {
                entries[j] = new Entry(key, value);
                ++size;
                ++used;
                return null;
            }
        }
        throw new IllegalStateException(); // table overflow


//        Basic implementation , in first lecture
//        entries[hash(key)] = new Entry(key,value);
//        ++size;
//        return null;
//    }
    }

    private int linearProbe(int h, int i){
        return (h + i)%entries.length;
    }
    private int quadraticProbe(int h, int i){
        return (h + i * i)%entries.length;
    }


    public Object remove (Object key){
            int h = hash(key);
            for (int i = 0; i < entries.length; i++) {
                int j = linearProbe(h,i);
                if (entries[j] == null) break;
                if(entries[j] == NIL) continue;
                if (entries[j].key.equals(key)) {
                    System.out.println(entries[j].key+" removed and value of i is:"+i);
                    Object value = entries[j].value;
                    entries[j] = NIL;
                    --size;
                    return value;
                }
            }
            return null;

        // Basic implementation , in first lecture
//        int h = hash(key);
//        Object value = entries[h].value;
//        entries[h] = null;
//        --size;
//        return value;
//    }

    }

    private void reHash(){
        Entry[] tempEntries = entries; // temp entries for holding entries
        entries = new Entry[2 * entries.length+1];
        for (Entry entry : tempEntries) {
            if (entry == null || entry == NIL) continue;
            int h = hash(entry.key);
            for (int i = 0; i < entries.length; i++) {
                int j = linearProbe(h, i); // j contains index
                if (entries[j] == null) {
                    entries[j] = entry;
                    break;
                }
            }
        }
        used = size;
    }

        public int size () {
            return size;
        }

        // implemented by me
    public void printHashTable() {
//        System.out.println(entries[1].value);
//        System.out.println(entries[2].value);
        for (Entry entry : entries) {
            if (entry != null && entry != NIL) {
                System.out.println("value " + entry.value + " having key " + entry.key + " stored at index:" + hash(entry.key));


            }
        }
    }

        public static void main (String[]args){


            // Basic implementation , in first lecture
            HashTable hashTable = new HashTable();
        hashTable.put("pk","Pakistan");
        hashTable.put("in","India");
        hashTable.put("ge","Germany");
        hashTable.put("PT", "Portugal");
        hashTable.put("GB", "United Kingdom");
//        System.out.println(hashTable.size());
//        hashTable.printHashTable();
            System.out.println(hashTable.get("PT"));
            System.out.println(hashTable.get("pk"));
            hashTable.remove("PT");
            System.out.println(hashTable.get("GB"));
//        hashTable.remove("PT");
//        hashTable.remove("GB");
//        hashTable.printHashTable();
//        hashTable.remove("in");
//        System.out.println("After removing in key");
//        System.out.println(hashTable.size());
//        System.out.println(hashTable.get("pk"));

//            System.out.println(hashTable.hash("PT")); // 1
//            System.out.println(hashTable.hash("GB")); // 1
        }
    }

