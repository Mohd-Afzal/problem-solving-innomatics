package dataStructures.learningBinaryTree;

import dataStructures.QueueNode;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

    static Scanner s = new Scanner(System.in);

    // 10 20 40 -1 -1 50 70 -1 -1 -1 30 -1 60 80 -1 90 -1 -1 -1
    public static BinaryTreeNode<Integer> buildTreeRecursive() {
        int rootData = s.nextInt(); // 10
        System.out.println("Input for this function call is: " + rootData);

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        BinaryTreeNode<Integer> leftSubTree = buildTreeRecursive(); // null (when hits the base condition - return null)
        BinaryTreeNode<Integer> rightSubTree = buildTreeRecursive(); // null (when hits the base condition - return null)

        root.leftChild = leftSubTree; // 10 -> null
        root.rightChild = rightSubTree; // // 10 -> null

        return root;
    }

    //10 20 30 40 50 -1 60 -1 -1 70 -1 80 -1 -1 -1 -1 90 -1 -1
    public static BinaryTreeNode<Integer> buildTreeLevelWise() {
//        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        QueueNode<BinaryTreeNode<Integer>> pendingNodes = new QueueNode<>();

        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);

        while (! pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> currentNode = pendingNodes.dequeue(); // 10

            int leftData = s.nextInt();
            if (leftData != -1) {
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftData); // 20
                currentNode.leftChild = leftNode; // 20 to the left of 10
                pendingNodes.enqueue(leftNode);
            }

            int rightData = s.nextInt();
            if (rightData != -1) {
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightData);
                currentNode.rightChild = rightNode;
                pendingNodes.enqueue(rightNode);
            }
        }

        return root;
    }


    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
//        BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(20);
//        BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(30);
//
//        root.leftChild = leftChild;
//        root.rightChild = rightChild;
//
//        System.out.println("Root : " + root.data);
//        System.out.println("Children of " + root.data + ": " + root.leftChild.data + ", " + root.rightChild.data);


        BinaryTreeNode<Integer> root = buildTreeLevelWise();
//        printLevelOrder(root);

    }
}
