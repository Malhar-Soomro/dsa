package com.DataStructures_And_Algorithms.Collection;

import java.util.Iterator;


public interface Collection {
    public boolean add(Object object);
    public Iterator<Object> iterator();
    public void clear();
    public boolean contains(Object object);
    public boolean isEmpty();
    public int size();
    public boolean remove(Object object);

}
