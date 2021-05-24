package com.DataStructures_And_Algorithms.BinaryTree;
public class BinarySearchTree {

        class Node {
            int key;
            Node left, right;

            public Node(int data){
                key = data;
                left = right = null;
            }
        }
        Node root;
    BinarySearchTree(){
            root = null;
        }
        void deleteKey(int key) {
            root = delete(root, key);
        }

        Node delete(Node root, int key)  {
            if (root == null)  return null;
            if (key < root.key)
                root.left = delete(root.left, key);
            else if (key > root.key)
                root.right = delete(root.right, key);
            else  {
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;
                root.key = minValue(root.right);

                root.right = delete(root.right, root.key);
            }
            return root;
        }

        int minValue(Node root)  {
            int minval = root.key;
            while (root.left != null)  {
                minval = root.left.key;
                root = root.left;
            }
            return minval;
        }

        void insert(int key)  {
            root = insert(root, key);
        }
        Node insert(Node root, int key) {
            //tree is empty
            if (root == null) {
                root = new Node(key);
                return root;
            }
            if (key < root.key)
                root.left = insert(root.left, key);
            else if (key > root.key)
                root.right = insert(root.right, key);
            return root;
        }

        void inorder() {
            inorder(root);
        }

        void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.key + " ");
                inorder(root.right);
            }
        }

        boolean search(int key)  {
            root = search(root, key);
            if (root!= null)
                return true;
            else
                return false;
        }

        Node search(Node root, int key)  {
            if (root==null || root.key==key)
                return root;
            if (root.key > key)
                return search(root.left, key);
            return search(root.right, key);
        }
    }
    class Main {
        public static void main(String[] args) {
            BinarySearchTree bst = new BinarySearchTree();
            bst.insert(47);
            bst.insert(12);
            bst.insert(5);
            bst.insert(16);
            bst.insert(70);
            bst.insert(40);

            System.out.println("The BST Created with input data(Left-root-right):");
            bst.inorder();

            System.out.println("\nThe BST after Delete 5(leaf node):");
            bst.deleteKey(5);
            bst.inorder();

            System.out.println("\nThe BST after Delete 70 (node with 1 child):");
            bst.deleteKey(70);
            bst.inorder();

            System.out.println("\nThe BST after Delete 40 (Node with two children):");
            bst.deleteKey(40);
            bst.inorder();

            boolean ret_val = bst.search(16);
            System.out.println("\nKey 16 found in BST:" + ret_val);
            ret_val = bst.search(50);
            System.out.println("\nKey 50 found in BST:" + ret_val);
        }
    }
