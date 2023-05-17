package com.example.proyecto2datos1adri;

public class BinarySTree {
    private BNode root;

    public BinarySTree() {
        this.root = null;
    }

    public void insert(String data) {
        root = insertRecursive(root, data);
    }

    private BNode insertRecursive(BNode current, String data) {
        if (current == null) {
            return new BNode(data);
        }

        if (data.compareTo(current.getData()) < 0) {
            current.setLeftChild(insertRecursive(current.getLeftChild(), data));
        } else if (data.compareTo(current.getData()) > 0) {
            current.setRightChild(insertRecursive(current.getRightChild(), data));
        }

        return current;
    }

    public boolean search(String data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(BNode current, String data) {
        if (current == null) {
            return false;
        }

        if (data.equals(current.getData())) {
            return true;
        }

        if (data.compareTo(current.getData()) < 0) {
            return searchRecursive(current.getLeftChild(), data);

        } else {
            return searchRecursive(current.getRightChild(), data);
        }
    }
}
