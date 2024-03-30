package org.example;

import java.util.NoSuchElementException;

public class Stack<T> { // Ежиков 4 Вариант
    private Node<T> head;
    public void push (T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(head);
            head = newNode;
        }
    }
    public T peek () {
        return head.getData();
    }

    public T pop () {
        if (this.empty()) throw new NoSuchElementException();
        T tmp = head.getData();
        head = head.getNext();
        return tmp;
    }

    public boolean empty () {
        return head == null;
    }
}
