package yzystudy.datastructrue.day1;

public class Node {
    private int data;        //节点的值
    private Node left;        //此节点的左子节点，数据类型为Node
    private Node right;       //此节点的右子节点，数据类型为Node

    public int getValue() {
        return data;
    }

    public void setValue(int value) {
        this.data = value;
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int value) {
        this.data=value;
        this.left=null;
        this.right=null;
    }
    public String toString() {         //自定义的toString方法，为了方便之后的输出
        return this.data+" ";
    }
}