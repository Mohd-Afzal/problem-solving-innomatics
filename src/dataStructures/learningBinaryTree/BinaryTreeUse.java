package dataStructures.learningBinaryTree;

import dataStructures.QueueNode;

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


    public static void printLevelOrder(BinaryTreeNode<Integer> root) {
        // Write your code here

        // Root check
        if (root == null) {
            return;
        }

        QueueNode<BinaryTreeNode<Integer>> pendingNodes = new QueueNode<>(); // Nodes to process in levels
        pendingNodes.enqueue(root);
        pendingNodes.enqueue(null); // ending of the 0th Level

        while (! pendingNodes.isEmpty()) {
            // Step - 1: Dequeue
            BinaryTreeNode<Integer> currentNode = pendingNodes.dequeue();

            // Step - 2: Make a decision on printing the data - Done in 2 parts
            // Part - 1: Check of null, if null then it is the end of the level
            if (currentNode == null) {

                // Check whether or not null is being repeated on every enqueue operation.
                if (pendingNodes.isEmpty()) {
                    return;
                }

                // End of the current level that we are processing
                System.out.println();

                // Insert null into the queue to mark the end of the current level
                pendingNodes.enqueue(null);
                continue;
            }

            // Part - 2: If not null -> print the data
            System.out.print(currentNode.data + " ");

            // Step - 3: Enqueue the Children of the currentNode
            if (currentNode.leftChild != null)
                pendingNodes.enqueue(currentNode.leftChild);

            if (currentNode.rightChild != null)
                pendingNodes.enqueue(currentNode.rightChild);
        }
    }


    // 450 - 10 20 30 40 50 -1 60 -1 -1 70 -1 80 -1 -1 -1 -1 90 -1 -1
    public static int getSum(BinaryTreeNode<Integer> root) {
        // Special Case
        if (root == null) {
            return 0;
        }

        // Base Case
        if (root.leftChild == null && root.rightChild == null) {
            return root.data;
        }

        int leftSum = getSum(root.leftChild);
        int rightSum = getSum(root.rightChild);

        int myAns = leftSum + rightSum + root.data;

        return myAns;
    }


    // 10 20 30 40 50 60 70 -1 -1 -1 -1 -1 -1 80 -1 -1 90 -1 -1  | 5
    public static int getHeight(BinaryTreeNode<Integer> root) {
        // Base case
        if (root == null) { // there doesnt exist a tree at all
            return 0;
        }

        int leftHeight = getHeight(root.leftChild); // leftSubTree
        int rightHeight = getHeight(root.rightChild); // rightSubTree

        return (1 + Math.max(leftHeight, rightHeight));
    }


    public static void printGreaterThanX(BinaryTreeNode<Integer> root, int x) {

        if (root == null) {
            return;
        }

        printGreaterThanX(root.leftChild, x);
        printGreaterThanX(root.rightChild, x);

        if (root.data > x) {
            System.out.print(root.data + " ");
        }
    }


    // 10 20 30 -1 -1 40 50 60 -1 -1 70 80 -1 -1 90 100 -1 -1 110 -1 -1 -1 -1
    // 10 20 30 40 -1 -1 50 -1 -1 60 70 -1 -1 -1 -1
    public static int diameter(BinaryTreeNode<Integer> root) {

        // Base Case
        if (root == null) {
            return 0;
        }

        // 1. When Diameter passes through the root of the tree
        int leftHeight = getHeight(root.leftChild);
        int rightHeight = getHeight(root.rightChild);

        int myDiameter = leftHeight + rightHeight + 1;

        // 2. When the Diameter is in the left sub-tree
        int leftDiameter = diameter(root.leftChild);

        // 3. When the Diameter is in the right sub-tree
        int rightDiameter = diameter(root.rightChild);


        return (Math.max(Math.max(leftDiameter, rightDiameter), myDiameter));

    }


    // Root Data : LR
    public static void preOrder(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    // LR : Root data
    public static void postOrder(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }

        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.data + " ");
    }

    // L Root Data R
    public static void inOrder(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }

        inOrder(root.leftChild);
        System.out.print(root.data + " ");
        inOrder(root.rightChild);
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
//        System.out.println(getSum(root));
//        System.out.println(getHeight(root));
//        printGreaterThanX(root, 30);
//        System.out.println(diameter(root));

        System.out.print("Pre-Order: ");
        preOrder(root);
        System.out.println();

        System.out.print("Post-Order: ");
        postOrder(root);
        System.out.println();

        System.out.print("In-Order: ");
        inOrder(root);
        System.out.println();

    }
}
