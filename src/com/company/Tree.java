package com.company;

public class Tree {
    private class Node {
        private int value;
        private Node leftNode;
        private Node rightNode;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true){
            if (value < root.value){
                if (current.leftNode== null){
                    current.leftNode  =node;
                    break;
                }
                current  = current.leftNode;
            }else {
                if (current.rightNode== null){
                    current.rightNode  =node;
                    break;
                }
                current  = current.rightNode;
        }
    }}
    public boolean find(int value){
        var current =root;
        while(current != null){
            if (value< current.value){
                current =current.leftNode;
            }else if(value> current.value){
                current =current.rightNode;
            }else {
                return true;
            }
        }
        return false;
    }
}
