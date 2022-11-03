package org.example.mystack;

public interface MyStackCanDo<T> extends MyStack<T>{

    boolean swapFirstLast();

    boolean reverse();

    boolean containsElement(T value);

    void clear();
}
