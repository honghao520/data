package structure.demo2;

public class TreeNode {
    //存放的数据
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void frontShow() {
        System.out.print(value);
        if (leftNode != null) {
            leftNode.frontShow();
        }
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    public void midShow() {
        if (leftNode != null) {
            leftNode.midShow();
        }
        System.out.print(value);
        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        if (this.value == i) {
            return this;
        } else {
            if (leftNode != null) {
                target = leftNode.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
            if (rightNode != null) {
                target = rightNode.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
        }
        return null;
    }

    public void remove(int i) {
        TreeNode parent = this;
        if (parent.leftNode!=null&&parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        if (parent.rightNode!=null&&parent.rightNode.value == i) {
            parent.leftNode = null;
            return;
        }
        parent = leftNode;
        if (parent !=null){
            parent.remove(i);
        }
        parent = rightNode;
        if (parent !=null){
            parent.remove(i);
        }
    }
}
