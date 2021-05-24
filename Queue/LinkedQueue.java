package com.DataStructures_And_Algorithms.Queue;

import com.DataStructures_And_Algorithms.Collection.Linked_Collection;

public class LinkedQueue implements Queue {
    private int size;
    private Node head = new Node(null);

    private static class Node{
        Object object;
        Node previous = this, next = this;
        Node(Object object){
            this.object = object;
        }
        Node(Object object, Node previous, Node next){
            this.object = object;
            this.previous = previous;
            this.next = next;
        }
    }

    @Override
    public void add(Object object) {
        head.previous.next = new Node(object,head.previous,head);
        head.previous = head.previous.next; 
        ++size;
    }

    @Override
    public Object first() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        return head.next.object;
    }

    @Override
    public Object remove() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        Object firstElement = head.next.object;
        head.next = head.next.next;
        head.next.previous = head;
        --size;
        return firstElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
}
