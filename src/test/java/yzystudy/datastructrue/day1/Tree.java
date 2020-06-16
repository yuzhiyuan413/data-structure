package yzystudy.datastructrue.day1;

public interface Tree {
    // 查找节点
    Node findNode(int key);

    // 插入节点
    boolean insert(int data);

    // 查找最大值
    Node findMax();

    // 查找最小值
    Node findMix();

    // 中序遍历
    void midOrder(Node current);

    // 前序遍历
    void preOrder(Node current);

    // 后序遍历
    void postOrder(Node current);
}
