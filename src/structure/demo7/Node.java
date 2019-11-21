package structure.demo7;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     *  添加节点二叉树排序
     * @param node 插入的节点
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        //如果添加的节点大于当前节点，往右递归
        if (this.value < node.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }

        } else {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }

        }
    }

    public void midShow() {
        if (this.left != null){
            this.left.midShow();
        }
        System.out.println(this.value);
        if (this.right!= null){
            this.right.midShow();
        }
    }
}
