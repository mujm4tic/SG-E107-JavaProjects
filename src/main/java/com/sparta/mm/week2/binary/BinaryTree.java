package com.sparta.mm.week2.binary;

//public values deals with values - for the user to interact with
//private deal with nodes


public class BinaryTree {

    private final Node rootNode;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    public boolean findElement (final int value){
        Node node = findNode (value);
        if (node != null){
            return true;
        } else {
            return false;
        }
    }

    private Node findNode(int element) {
        Node node = rootNode;
        // default value of null for all objects
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        } return null;
    }

    private void addNodeToTree(Node node, int element) {
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (element < node.getValue()) {
                if (node.isRightChildEmpty()) {
                    Node rightChild = new Node(element);
                    node.setRightChild(rightChild);
                } else {
                    addNodeToTree(node.getRightChild(), element);
                }
            }


        }
    }
}