package org.example.mystack;

public interface MyStack<T> {
    boolean push(T value);

    T pop();

    T peek();
}
