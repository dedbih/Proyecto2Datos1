package com.example.proyecto2datos1adri;

import java.util.NoSuchElementException;

public class Queue {
    private QNode front;
    private QNode rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(String data) {
        QNode newNode = new QNode(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        String data = front.getData();
        front = front.getNext();

        if (front == null) {
            rear = null;
        }

        return data;
    }
}
