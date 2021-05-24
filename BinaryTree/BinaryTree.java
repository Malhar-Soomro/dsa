package com.DataStructures_And_Algorithms.BinaryTree;

public class BinaryTree {
    private Object root;
    private BinaryTree left, right;

    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public Object getRoot() {
        return root;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public Object setRoot(Object root) {
        Object oldRoot = this.root;
        this.root = root;
        return oldRoot;
    }

    public BinaryTree setLeft(BinaryTree left) {
        BinaryTree oldLeft = this.left;
        this.left = left;
        return oldLeft;
    }

    public BinaryTree setRight(BinaryTree right) {
        BinaryTree oldRight = this.right;
        this.right = right;
        return oldRight;
    }

//     in-order traversal
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        // left - root - right
        if(left != null) stringBuilder.append(left+",");
        stringBuilder.append(root);
        if(right != null) stringBuilder.append(","+right);
        return stringBuilder + "";

    }

    // pre-order traversal
    public String preOrder(){
        StringBuilder stringBuilder = new StringBuilder();
        // root - left - right
        stringBuilder.append(root);
        if(left != null) stringBuilder.append(","+left.preOrder());
        if(right != null) stringBuilder.append(","+right.preOrder());
        return stringBuilder + "";
    }

    //post-order traversal
    public String postOrder(){
        StringBuilder stringBuilder = new StringBuilder();
        //left - right - root
        if(left != null) stringBuilder.append(left.postOrder()+",");
        if(right != null) stringBuilder.append(right.postOrder()+",");
        stringBuilder.append(root);
        return stringBuilder + "";

    }
    static public boolean isLeaf(BinaryTree tree){
        return tree.left == null && tree.right == null;
    }

    public int size(){
        if(left == null && right == null)return 1;
        if(left == null) return 1 + right.size();
        if(right == null) return 1 + left.size();
        return 1 + left.size() + right.size();
    }
    public int height(){
        if(root == null) return -1;
        int lefts = 0, rights = 0;
        if(left != null){
            lefts = 1 + left.height();
        }
        if(right != null){
            rights = 1 + right.height();
        }
        return Math.max(lefts, rights);

    }
    public boolean contains(Object object){
        if (root == object) return true;
        boolean containing = false;
        if(left!=null){
            if(left.toString().contains(object.toString())) return true;
            containing = left.contains(object);
        }
        if(right!=null){
            if(right.toString().contains(object.toString())) return true;
            containing = right.contains(object);
        }
        return containing;
    }
    //Binary Search Tree
    //insertion , Retrieval , Deletion

    public static void main(String[] args) {
        BinaryTree treeG = new BinaryTree("g");
        BinaryTree treeF = new BinaryTree("f");
        BinaryTree treeE = new BinaryTree("e");
        BinaryTree treeD = new BinaryTree("d");
        BinaryTree treeC = new BinaryTree("c", treeF,treeG);
        BinaryTree treeB = new BinaryTree("b", treeD,treeE);
        BinaryTree treeA = new BinaryTree("A", treeB,treeC);
//        System.out.println("In-order: "+treeA);
//        System.out.println("Pre-Order: "+treeA.preOrder());
//        System.out.println("Post-Order: "+treeA.postOrder());
        System.out.println(isLeaf(treeG));

    }

}