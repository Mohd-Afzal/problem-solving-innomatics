package dataStructures.learningBinaryTree;

public class BinaryTreeUse {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(30);

        root.leftChild = leftChild;
        root.rightChild = rightChild;

        System.out.println("Root : " + root.data);
        System.out.println("Children of " + root.data + ": " + root.leftChild.data + ", " + root.rightChild.data);

    }
}
