package org.example.mystack;

public class MyStackImpl<T> implements MyStackCanDo{

    private T[] values;
    private int top;

    public MyStackImpl(T[] values)
    {
        this.values = values;
        top = -1;
    }


    @Override
    public boolean push(Object value) {
        if (isFull() == false) {
            values[++top] = (T) value;
            return true;
        }
        else
            return false;

    }

    @Override
    public T pop() {
        return values[--top];
    }

    @Override
    public T peek() {
        return values[top];
    }

    private boolean isEmpty()
    {
        return (top == -1);
    }
    private boolean isFull()
    {
        return (top == values.length - 1);
    }

    @Override
    public boolean swapFirstLast()
    {
        if (isEmpty() == true)
        {
            return false;
        }
        else
        {
            T t = values[0];
            values[0] = values[top];
            values[top] = t;
            return true;
        }
    }

    @Override
    public boolean reverse()
    {
        if (isEmpty() == true)
            return false;
        else
        {
            for(int i = 0; i <= top/2; i++)
            {
                T t = values[i];
                values[i] = values[top - i];
                values[top - i] = t;
            }
            return true;
        }
    }


    @Override
    public boolean containsElement(Object value)
    {
        if (isEmpty()) return false;

        for (T t : values)
        {
            if (t.equals(value)) return true;
        }
        return false;
    }

    @Override
    public void clear()
    {
      top = -1;
    }

    public void display() {
        if (isEmpty() == false) {
            System.out.println();
            System.out.print("Stack: [ ");
            for (int i = 0; i <= top; i++) {
                System.out.print(values[i] + "; ");
            }
            System.out.print("]");
        }
        else System.out.println("empty stack!");
    }

}
