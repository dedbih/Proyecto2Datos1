package com.example.proyecto2datos1adri;

public class BNode {
    private String data;
    private BNode leftChild;
    private BNode rightChild;

    public BNode(String data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BNode leftChild) {
        this.leftChild = leftChild;
    }

    public BNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BNode rightChild) {
        this.rightChild = rightChild;
    }
}
