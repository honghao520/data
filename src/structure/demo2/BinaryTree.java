package structure.demo2;

public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void frontShow() {
        root.frontShow();
    }
    public void  midShow(){
        root.midShow();
    }

    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void remove(int i) {
        if (root.value == i){
            root = null;
        }else {
            root.remove(i);
        }
    }
}
