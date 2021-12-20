package dataStructures.learningBinaryTree;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> leftChild;
    BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
