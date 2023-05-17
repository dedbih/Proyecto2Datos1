package com.example.proyecto2datos1adri;

public class QNode {
    private String data;
    private QNode next;

    public QNode(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public QNode getNext() {
        return next;
    }

    public void setNext(QNode next) {
        this.next = next;
    }
}
