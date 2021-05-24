package com.DataStructures_And_Algorithms.Stack;

public interface Stack {
    public Object peek(); // return top most element in the stack
    public Object pop(); // return and remove the top most element
    public void push(Object object); // add element
    public int size(); // returns the length of stack
    public boolean isEmpty(); // if the stack is empty returns true otherwise false
}
