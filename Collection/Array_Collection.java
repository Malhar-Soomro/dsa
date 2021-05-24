package com.DataStructures_And_Algorithms.Collection;

import java.util.Iterator;

public class Array_Collection extends Abstract_Collection {
    private int size = 0;
    private final int INITIAL_LENGTH = 15;
    private Object[] array = new Object[INITIAL_LENGTH];


    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean add(Object object) {
        if (size == array.length) resize();
        array[size++] = object;
        return true;
    }


    private void resize() {
        Object[] tempArray = array;
        array = new Object[2 * tempArray.length];
        System.arraycopy(tempArray, 0, array, 0, size);
    }



    @Override
    public Iterator<Object> iterator() {
        return new Iterator() {

            private int index = 0;
            private boolean okToRemove = false;
            public boolean hasNext() {
                return (index < size);
            }

            public Object next() {
                if (index == size) throw new RuntimeException();
                okToRemove = true;
                return array[index++];
            }

            public void remove() {
                if (!okToRemove) throw new IllegalStateException();
                array[--index] = array[--size];
                array[size] = null;
                okToRemove = false;
            }
        };

    }
}
