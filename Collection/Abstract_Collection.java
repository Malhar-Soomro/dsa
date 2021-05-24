package com.DataStructures_And_Algorithms.Collection;

import java.util.Iterator;

public abstract class Abstract_Collection implements Collection {

    private int size = 0;

    @Override
    public abstract boolean add(Object object);

    @Override
    public void clear() {
        for(Iterator<Object> it = iterator(); it.hasNext();){
            it.next();
            it.remove();
        }
    }

    @Override
    public boolean contains(Object object) {
        Iterator it = iterator();
        if (object == null)
            while (it.hasNext()){
                if (it.next() == null) return true;
            }
        else
            while(it.hasNext()){
                if (object.equals(it.next())) return true;
            }
        return false;
    }
    public abstract boolean isEmpty();

    @Override
    public boolean remove(Object object) {
        Iterator<Object> it = iterator();
        if(object == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                    return true;
                }
            }
        }
        else {
            while (it.hasNext()){
                if(object.equals(it.next())){
                    it.remove();
                }

            }
        }
        return false;
    }


    public String toString(){
        if(isEmpty()) return "[]";
        Iterator<Object> it = iterator();
        StringBuffer stringBuffer = new StringBuffer("["+ it.next());
        while (it.hasNext())
            stringBuffer.append(","+it.next());
        return (stringBuffer+"]");
    }

    public abstract Iterator<Object> iterator();

    public abstract int size();

}
