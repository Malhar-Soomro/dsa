package com.DataStructures_And_Algorithms.Collection;

import java.util.Iterator;
public class Linked_Collection extends Abstract_Collection {

    public static class Node{
        Object object;
        Node previous, next;
        Node(){ previous = next = this; }
        Node(Object object, Node previous, Node next){
            this.object = object;
            this.previous = previous;
            this.next = next;
        }
    }
    private int size; 
    private Node head = new Node();



    @Override
    public boolean add(Object object) {
        head.previous = head.previous.next = new Node(object, head.previous, head);
        size++;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            private Node cursor = head.next;
            private boolean okToRemove = false;
            @Override
            public boolean hasNext() {
                return cursor != head;
            }

            @Override
            public Object next() {
                if (cursor == head) throw new RuntimeException();
                okToRemove = true;
                Object object = cursor.object;
                cursor = cursor.next;
                return object;
            }
            public void remove(){
             if (!okToRemove) throw new IllegalStateException();
             cursor.previous = cursor.previous.previous;
             cursor.previous.next = cursor;
             size--;
             okToRemove = false;
            }
        };


    }

    @Override
    public int size() {
        return 0;
    }
}
