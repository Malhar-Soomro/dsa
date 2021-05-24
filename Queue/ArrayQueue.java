package com.DataStructures_And_Algorithms.Queue;

public class ArrayQueue implements Queue {
    public Object [] objects;
    private int size;

    public ArrayQueue(int capacity){
        objects = new Object[capacity];
    }
    @Override
    public void add(Object object) {
        if (size == objects.length) resize();
        objects[size++] = object;
    }

    @Override
    public Object first() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        return objects[0];
    }

    @Override
    public Object remove() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        --size;
        Object tempObject = objects[0];
        System.arraycopy(objects,1,objects,0,size);
        return tempObject;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    private void resize(){
        Object[] tempObject = objects;
        objects = new Object[2*tempObject.length];
        System.arraycopy(tempObject,0,objects,0,size);

    }
    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(4);
        arrayQueue.add("Tiger");
        arrayQueue.add("Elephant");
        arrayQueue.add("Kangroo");
        arrayQueue.add("Monkey");
        arrayQueue.add("Cat");
        System.out.println(arrayQueue.objects.length);
        System.out.println(arrayQueue.size());
    }

}
