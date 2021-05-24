package com.DataStructures_And_Algorithms.Stack;

import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack implements Stack {
    public int size = 0;
    Node top;

    static class Node {
        Object data = null;
        Node next = null;
        Node() {
            this.data = null;
            this.next = null;
        }
        Node(Object object) {
            this.data = object;
            this.next = null;
        }
        Node(Object object, Node next) {
            this.data = object;
            this.next = next;
        }
    }




    LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public Object pop() { // O(1)
        if(size < 1) throw new NoSuchElementException();
        Object old = this.top.data;
        this.top = this.top.next;
        size--;
        return old;
    }

    @Override
    public void push(Object object) { // O(1)
        if(size > 0) {
            Node temp = this.top;
            this.top = new Node(object, temp);
        } else {
            this.top = new Node(object, null);
        }
        this.size++;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object peek() { // O(1)
        if(size < 1) throw new NoSuchElementException();
        return this.top.data;
    }

    @Override
    public int size() { // O(1)
        return this.size;
    }

    public boolean equals(LinkedStack stack) { // O(n)
        if(this.size != stack.size) return false;
        for(Node i = this.top, j = stack.top; i != null && j != null; i = i.next, j = j.next) {
            if(i.data != j.data) {
                return false;
            }
        }
        return true;
    }

    public Object findLast() { // O(n)
        LinkedStack clone = this.clone();
        Object last = null;
        while(clone.size() >= 1) {
            last = clone.pop();
        }
        return last;
    }

    public LinkedStack clone() { // O(n)
        LinkedStack cloneStack = new LinkedStack();
        Object[] array = new Object[this.size];
        int count = 0;
        for(Node i = this.top; i != null; i = i.next) {
            array[count++] = i.data;
        }
        for(int i = array.length-1; i >= 0; --i)
            cloneStack.push(array[i]);
        return cloneStack;
    }

    public ArrayStack toArrayStack() { // O(n)
        ArrayStack toArrayStack = new ArrayStack();
        Object[] array = new Object[this.size];
        int count = 0;
        for(Node i = this.top; i != null; i = i.next) {
            array[count++] = i.data;
        }
        for(int i = array.length-1; i >= 0; --i)
            toArrayStack.push(array[i]);
        return toArrayStack;
    }

    public String toString() { // added another loop to arrange them in such order - which adds/removes in right last
        StringBuilder full = new StringBuilder();
        for(Node i = this.top; i != null; i = i.next) {
            full.append(i.data).append(" ");
        }
        String[] arr = full.toString().split(" ");
        full = new StringBuilder("[ ");
        for(int i = arr.length-1; i >= 0; i--) {
            full.append(arr[i]).append(", ");
        }
        return full.substring(0, full.length()-2) + " ]";
    }

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        linkedStack.push("4");
        linkedStack.push("5");
        System.out.println(linkedStack);
    }
}