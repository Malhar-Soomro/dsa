package com.DataStructures_And_Algorithms.Stack;

public class ArrayStack implements Stack {
    private Object[] array;
    private int size;

    ArrayStack(int capacity) {
        array = new Object[capacity];

    }

    ArrayStack() {
        this.array = new Object[2];
    }

    @Override
    public Object peek() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        return array[size - 1];
    }

    @Override
    public Object pop() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        Object object = array[--size];
        array[size] = null;
        return object;
    }

    @Override
    public void push(Object object) {
        if (size == array.length) resize();
        array[size++] = object;
    }

    private void resize() {
        Object[] tempArray = array;
        array = new Object[2 * array.length];
        System.arraycopy(tempArray, 0, array, 0, size);
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0) ;
    }



    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push("Mangoes");
        arrayStack.push("Oranges");
        arrayStack.push("Grapes");
        arrayStack.push("Apples");

        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.size());

//        Object popped = arrayStack.pop();
//        System.out.println(popped); // Apples
//
//        popped = arrayStack.pop();
//        System.out.println(popped); // Grapes
//
//        popped = arrayStack.pop();
//        System.out.println(popped); // Oranges
//
//        System.out.println(arrayStack.size());




    }

}
