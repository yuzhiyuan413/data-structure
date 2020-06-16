package yzystudy.datastructrue.day1;

public class BinaryTree implements Tree {
    private Node root;
    @Override
    public Node findNode(int key) {
        Node current = root;
        while (current!=null) {
            if(current.getValue() > key) {
                current = current.getLeft();
            } else if(current.getValue() < key) {
                current = current.getRight();
            } else{
                return current;
            }
        }
        return current;
    }

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(root == null) {
            root = newNode;
            return true;
        }

        Node current = root;
        while (current != null) {
            if(current.getValue() > data) {
                Node left = current.getLeft();
                if(left == null) {
                    current.setLeft(newNode);
                    return true;
                }
                current = left;
            }

            if(current.getValue() < data) {
                Node right = current.getRight();
                if(right == null) {
                    current.setRight(newNode);
                    return true;
                }
                current = right;
            }
        }
        return false;
    }

    @Override
    public Node findMax() {
        Node current = root;
        while (current != null) {
            Node right = current.getRight();
            if(right == null) {
                return current;
            }
            current = current.getRight();
        }
        return current;
    }

    @Override
    public Node findMix() {
        Node current = root;
        while (current != null) {
            Node left = current.getLeft();
            if(left == null) {
                return current;
            }
            current = current.getLeft();
        }
        return current;
    }

    @Override
    public void midOrder(Node current) {

    }

    @Override
    public void preOrder(Node current) {

    }

    @Override
    public void postOrder(Node current) {

    }
}
