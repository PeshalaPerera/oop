package com.oop.tutorial6;

interface Node {
    void print();
}

class TreeNode implements Node {
    int data;

    TreeNode(int data) {
        this.data = data;
    }

    public void print() {
        System.out.println("data: " + data);
    }
}

class Vertex implements Node {
    int x; // x coordinate
    int y; // y coordinate

    Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("x: " + x + ", y: " + y);
    }
}

public class NodeTest {
    static void printLabel(Node n) {
        if (n instanceof TreeNode)
            System.out.print("Treenode-> ");
        else if (n instanceof Vertex)
            System.out.print("Vertex-> ");
        n.print();
    }

    public static void main(String[] args) {
        Node n1 = new TreeNode(100);
        Node n2 = new Vertex(500, 400);
        printLabel(n1);
        printLabel(n2);
    }
}
