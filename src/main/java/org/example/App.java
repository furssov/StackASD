package org.example;

import org.example.mystack.MyStackImpl;

import java.util.Scanner;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        boolean x = true;

        System.out.print("Enter the size of stack: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        MyStackImpl<Integer> myStack = new MyStackImpl<>(new Integer[size]);

        while (x)
        {
            System.out.println();
            System.out.println("1. Push \n");
            System.out.println("2. Pop \n");
            System.out.println("3. Peek \n");
            System.out.println("4. Switch first and last \n");
            System.out.println("5. Reverse \n");
            System.out.println("6. Does this element exist? \n");
            System.out.println("7. Clear \n");
            System.out.println("8. Display \n");

            System.out.println("Choose the point: ");
            int point = scanner.nextInt();
            switch (point)
            {
                case 1:
                {
                    System.out.println("Enter the element to push:");
                    int element = scanner.nextInt();
                    myStack.push(element);
                    break;
                }
                case 2:
                {
                    System.out.println("Element from stack: " + myStack.pop());
                    break;
                }
                case 3:
                {
                    System.out.println("Element from stack: " + myStack.peek());
                    break;
                }
                case 4:
                {
                    myStack.swapFirstLast();
                    break;
                }
                case 5:
                {
                    myStack.reverse();
                    break;
                }
                case 6:
                {
                    System.out.println("Enter the element to check:");
                    int element = scanner.nextInt();
                    System.out.println(myStack.containsElement(element));
                    break;
                }
                case 7:
                {
                    myStack.clear();
                    break;
                }
                case 8:
                {
                    myStack.display();
                    break;
                }
                default:
                {
                    x = false;
                    break;
                }

            }
        }

    }
}
